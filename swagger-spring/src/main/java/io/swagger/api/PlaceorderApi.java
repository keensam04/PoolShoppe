package io.swagger.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.model.Order;
import io.swagger.model.Statusinfo;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-11-30T08:21:01.198Z")

@Api(value = "placeorder", description = "the placeorder API")
public interface PlaceorderApi {

    @ApiOperation(value = "", notes = "", response = Statusinfo.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "PLace an order", response = Statusinfo.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Statusinfo.class) })
    @RequestMapping(value = "/placeorder",
        method = RequestMethod.POST)
    ResponseEntity<List<Statusinfo>> placeorderPost(@ApiParam(value = "The order JSON you want to post" ,required=true ) @RequestBody Order order);

}
