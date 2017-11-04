package io.swagger.api;

import io.swagger.model.Channel;

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

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-11-04T14:03:22.034Z")

@Api(value = "channel", description = "the channel API")
public interface ChannelApi {

    @ApiOperation(value = "adds a channel", notes = "Adds a channel to the system", response = Void.class, tags={ "admins","developers", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "channel created", response = Void.class),
        @ApiResponse(code = 400, message = "invalid input, object invalid", response = Void.class),
        @ApiResponse(code = 409, message = "an existing channel already exists", response = Void.class) })
    @RequestMapping(value = "/channel",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Void> addChannel(@ApiParam(value = "Channel to add"  ) @RequestBody Channel channel);


    @ApiOperation(value = "deletes a channel", notes = "Deletes a channel from the system", response = Void.class, tags={ "admins", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "channel deleted", response = Void.class),
        @ApiResponse(code = 400, message = "invalid input, object invalid", response = Void.class) })
    @RequestMapping(value = "/channel",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteChannel(@ApiParam(value = "Channel to delete"  ) @RequestBody Channel channel);


    @ApiOperation(value = "searches channels", notes = "By passing in the appropriate options, you can search for available channel in the system ", response = Channel.class, responseContainer = "List", tags={ "admins","developers", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "search results matching criteria", response = Channel.class),
        @ApiResponse(code = 400, message = "bad input parameter", response = Channel.class) })
    @RequestMapping(value = "/channel",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Channel>> searchChannel(@ApiParam(value = "pass an optional search id for looking up channel") @RequestParam(value = "idChannel", required = false) String idChannel);

}
