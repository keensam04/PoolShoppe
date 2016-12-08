package io.swagger.api;

import io.swagger.annotations.ApiParam;
import io.swagger.configuration.DataSourceBuilder;
import io.swagger.model.OnlinePlaceOrderTable;
import io.swagger.model.Order;
import io.swagger.model.ShareBuddyInfo;
import io.swagger.model.Statusinfo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-11-30T08:21:01.198Z")

@Controller
public class PlaceorderApiController implements PlaceorderApi {
	
	private JdbcTemplate template = DataSourceBuilder.getObject().getJdbcTemplate();
   
    public ResponseEntity<List<Statusinfo>> placeorderPost(@ApiParam(value = "The order JSON you want to post" ,required=true ) @RequestBody Order order) {
    	List<Statusinfo> statusinfos = new ArrayList<>();
    	statusinfos = insertNamedParameter(order);
    	 HttpHeaders responseHeaders = new HttpHeaders();
    	return new ResponseEntity<List<Statusinfo>>(statusinfos, responseHeaders, HttpStatus.CREATED);
    }
    
    public String getCurrentTime(){
    	Date date = new Date();
    	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    	String formattedDate = sdf.format(date);
    	return formattedDate;
    }  
    public List<Statusinfo> insertNamedParameter(Order order){
    	List<ShareBuddyInfo> sharebuddlist = new ArrayList<>();
    	List<Statusinfo> statusinfolist = new ArrayList<>();
    	Statusinfo statusinfo = new Statusinfo();
    	String orderId = generateUniqueId();
    	String custId = order.getCustomerId();
    	String productId = order.getProductid();
    	String addressPinCode = order.getDeliverAddress().get(0).getPinCode();
    	String addresslocation  = order.getDeliverAddress().get(0).getAddressLine1();
    	String time = getCurrentTime();
    	String status = "InProcess";
    	String shareId = "";
    	
    	String sql = "INSERT INTO OnlinePlaceOrderTable " +
    		"VALUES('"+orderId+"','"+custId+"','"+productId+"','"+addressPinCode+"','"+addresslocation+"','"+time+"','"+status+"','"+shareId+"')";
    	template.execute(sql);
    	System.out.println("Order placed");
    	String getMatchedPartnerQuery = "SELECT * FROM OnlinePlaceOrderTable WHERE Time <='" +time+ "' AND Addresspincode = '" +addressPinCode+ "' AND Status='InProcess'"; 
    	List<Map<String, Object>> onlineorderlist = new ArrayList<>();
    	onlineorderlist = template.query(getMatchedPartnerQuery, new RowMapper<Map<String, Object>>() {
			@Override
			public Map<String, Object> mapRow(ResultSet rs, int rowNum) throws SQLException {
				try {
					return mapRowForonlineorder(rs);
				} catch (SQLException e) {
					System.out.println("sqlexception");
					return null;
				}
				
			}
		});
    	List<Map<String, Object>> orderresponselist = new ArrayList<>();
    	if(onlineorderlist.size()>1){
    		shareId = generateUniqueId();
    		for (Map<String, Object> eachOrder : onlineorderlist) {
    			System.out.println("Shopping Shared");	
    			Object matchedPartnerOrderId = eachOrder.get("OrderId");
    			String updateSql = "UPDATE OnlinePlaceOrderTable SET shareId='"+shareId+ "', Status ='Placed' WHERE OrderId='"+matchedPartnerOrderId+"'";
    			template.execute(updateSql);
			}
    		String getresponseQuery = "SELECT * FROM OnlinePlaceOrderTable WHERE shareId='"+shareId+ "'"; 
        	
        	orderresponselist = template.query(getresponseQuery, new RowMapper<Map<String, Object>>() {
    			@Override
    			public Map<String, Object> mapRow(ResultSet rs, int rowNum) throws SQLException {
    				try {
    					return mapRowForonlineorder(rs);
    				} catch (SQLException e) {
    					System.out.println("sqlexception");
    					return null;
    				}
    				
    			}
    		});
        	for (Map<String, Object> map : orderresponselist) {
        		System.out.println("map with the same share id"+map);
        	   Object custid = map.get("CustId");
        	   System.out.println(custId+"custid of the people with same id"+custid);
        		if(custId.equals(custid))
        		{
        			System.out.println("custid placing the order"+custId);
        		statusinfo.setShareId((String) map.get("ShareId"));
        		statusinfo.setOrderStatusCode((String) map.get("Status"));
        		statusinfo.setOrderStatusDescription((String) map.get("Status"));
        		
        		for (Map<String, Object> sharebuddies : orderresponselist) {
        	      System.out.println(sharebuddies.get("CustId"));
        			if(!custId.equals(sharebuddies.get("CustId")))
        			{
        				
        			ShareBuddyInfo sharebuddy = new ShareBuddyInfo();
            		sharebuddy.setId((String) sharebuddies.get("CustId"));
            		sharebuddy.setRating("4");
            		sharebuddy.setGender("F");
            		sharebuddy.setAmountPaid("400");
            		sharebuddy.setPhoneNumer("9046789076");
            		sharebuddlist.add(sharebuddy);
        			}
        		}
        		statusinfo.setShareBuddies(sharebuddlist);
        		statusinfo.setWalletmoneyleft("500");
        		}	
        	}
			}
    	else
    	{
    		//Statusinfo statusinfo = new Statusinfo();
    		statusinfo.setOrderStatusCode("InProcess");
    		statusinfo.setWalletmoneyleft("500");
    		statusinfo.setAmountPaid("500");
    		
    	}
    	statusinfolist.add(statusinfo);
		return statusinfolist;
    	
    	}
    
    
    private Map<String, Object> mapRowForonlineorder(ResultSet rs) throws SQLException  { 
    	Map<String, Object> orderdata = new HashMap<String, Object>();
    	//CREATE TABLE OnlinePlaceOrderTable(OrderId VARCHAR(100), CustId VARCHAR(100), ProductId VARCHAR(100), Addresspincode VARCHAR(10), Addresslocation VARCHAR(100), Time TIMESTAMP, Status VARCHAR(24), ShareId VARCHAR(100))";
    	orderdata.put("OrderId", rs.getString("OrderId"));
    	orderdata.put("CustId", rs.getString("CustId"));
    	orderdata.put("Addresspincode", rs.getString("Addresspincode"));
    	orderdata.put("ProductId", rs.getString("ProductId"));
    	orderdata.put("Addresslocation", rs.getString("Addresslocation"));
    	orderdata.put("Status", rs.getString("Status"));
    	orderdata.put("ShareId", rs.getString("ShareId"));
    	return orderdata;
    }
    public String generateUniqueId(){
    	UUID uuid = UUID.randomUUID();
    	return uuid.toString();
    }
   
    public String getStatus(String orderId){
    	/*String getMatchedPartnerQuery = "SELECT * FROM OnlinePlaceOrderTable where OrderId = :orderId"; 
        Map<String, Object> parameters = new HashMap<String, Object>();	
    	parameters.put("orderId", orderId);
    	List<OnlinePlaceOrderTable> onlineOrders = template.query(getMatchedPartnerQuery, new OnlinePlaceOrderTableRowMapper(), parameters);
    	return onlineOrders.get(0).getStatus();*/
    	return "";
    }
}
