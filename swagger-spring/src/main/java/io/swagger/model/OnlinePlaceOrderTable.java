package io.swagger.model;

public class OnlinePlaceOrderTable {
	
	private String orderId;
	private String custId;
	private String productId;
	private String addressPinCode;
	private String addresslocation;
	private String time;
	private String status;
	private String shareId;
	
	public OnlinePlaceOrderTable(String orderId, String custId, String productId,
			String addressPinCode, String addresslocation, String time, String status,
			String shareId) {
		this.orderId = orderId;
		this.custId = custId;
		this.productId = productId;
		this.addressPinCode = addressPinCode;
		this.addresslocation = addresslocation;
		this.time = time;
		this.status = status;
		this.shareId = shareId;
	}
	
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getCustId() {
		return custId;
	}
	public void setCustId(String custId) {
		this.custId = custId;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getAddressPinCode() {
		return addressPinCode;
	}
	public void setAddressPinCode(String addressPinCode) {
		this.addressPinCode = addressPinCode;
	}
	public String getAddresslocation() {
		return addresslocation;
	}
	public void setAddresslocation(String addresslocation) {
		this.addresslocation = addresslocation;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getShareId() {
		return shareId;
	}
	public void setShareId(String shareId) {
		this.shareId = shareId;
	}
}
