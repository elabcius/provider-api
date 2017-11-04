package io.swagger.api;

import io.swagger.model.Provider;

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

@Api(value = "provider", description = "the provider API")
public interface ProviderApi {

    @ApiOperation(value = "adds a provider", notes = "Adds a provider to the system", response = Void.class, tags={ "admins","developers", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "provider created", response = Void.class),
        @ApiResponse(code = 400, message = "invalid input, object invalid", response = Void.class),
        @ApiResponse(code = 409, message = "an existing provider already exists", response = Void.class) })
    @RequestMapping(value = "/provider",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Void> addProvider(@ApiParam(value = "Provider to add"  ) @RequestBody Provider provider);


    @ApiOperation(value = "deletes a provider", notes = "Deletes a provider from the system", response = Void.class, tags={ "admins", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "provider deleted", response = Void.class),
        @ApiResponse(code = 400, message = "invalid input, object invalid", response = Void.class) })
    @RequestMapping(value = "/provider",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteProvider(@ApiParam(value = "Provider to delete"  ) @RequestBody Provider provider);


    @ApiOperation(value = "searches providers", notes = "By passing in the appropriate options, you can search for available provider in the system ", response = Provider.class, responseContainer = "List", tags={ "admins","developers", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "search results matching criteria", response = Provider.class),
        @ApiResponse(code = 400, message = "bad input parameter", response = Provider.class) })
    @RequestMapping(value = "/provider",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Provider>> searchProvider(@ApiParam(value = "pass an optional search id for looking up provider") @RequestParam(value = "idProvider", required = false) String idProvider);

}
