package io.swagger.api;

import io.swagger.model.Statusinfo;
import io.swagger.model.Error;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-11-30T08:21:01.198Z")

@Api(value = "OrderStatus", description = "the OrderStatus API")
public interface OrderStatusApi {

    @ApiOperation(value = "Order Status", notes = "", response = Statusinfo.class, responseContainer = "List", tags={ "orderstatus", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Detail of the product", response = Statusinfo.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Statusinfo.class) })
    @RequestMapping(value = "/OrderStatus",
        method = RequestMethod.GET)
    ResponseEntity<List<Statusinfo>> orderStatusGet(@ApiParam(value = "Id of the customer.", required = true) @RequestParam(value = "customerid", required = true) String customerid,
        @ApiParam(value = "order id.", required = true) @RequestParam(value = "orderid", required = true) String orderid);

}
