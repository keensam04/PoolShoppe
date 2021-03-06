package io.swagger.api;

import io.swagger.model.ShareBuddyInfo;
import io.swagger.model.Error;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-11-30T08:21:01.198Z")

@Controller
public class GetInterestedBuddiesApiController implements GetInterestedBuddiesApi {

    public ResponseEntity<List<ShareBuddyInfo>> getInterestedBuddiesGet(@ApiParam(value = "Id of the customer.", required = true) @RequestParam(value = "customerid", required = true) String customerid,
        @ApiParam(value = "order id.", required = true) @RequestParam(value = "order", required = true) String order,
        @ApiParam(value = "order id.", required = true) @RequestParam(value = "location", required = true) String location) {
        // do some magic!
        return new ResponseEntity<List<ShareBuddyInfo>>(HttpStatus.OK);
    }

}
