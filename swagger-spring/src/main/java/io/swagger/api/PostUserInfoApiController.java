package io.swagger.api;

import io.swagger.annotations.ApiParam;
import io.swagger.configuration.DataSourceBuilder;
import io.swagger.model.UserInfo;

import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-11-30T08:21:01.198Z")
@Controller
public class PostUserInfoApiController implements PostUserInfoApi {

	public ResponseEntity<Void> postUserInfoPost(
			@ApiParam(value = "The order JSON you want to post", required = true) @RequestBody UserInfo userdetail) {

		JdbcTemplate template = DataSourceBuilder.getObject().getJdbcTemplate();

		String custId = userdetail.getId();
		String name = userdetail.getName();
		String phoneNumber = userdetail.getPhoneNumer();
		String gender = userdetail.getGender();
		String status = userdetail.getStatus();
		String offerId = userdetail.getOfferId();

		String sql = "INSERT INTO OfflineUserTable " + "VALUES('" + custId + "','" + name + "','" + phoneNumber + "','" + gender + "','" + status + "','" + offerId + "')";
		template.execute(sql);

		return new ResponseEntity<Void>(HttpStatus.OK);
	}
}
