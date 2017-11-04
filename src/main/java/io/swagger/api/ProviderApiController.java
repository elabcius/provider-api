package io.swagger.api;

import io.swagger.model.Provider;

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


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-11-04T14:39:56.794Z")

@Controller
public class ProviderApiController implements ProviderApi {

    public ResponseEntity<Void> addProvider(@ApiParam(value = "Provider to add"  ) @RequestBody Provider provider) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> deleteProvider(@ApiParam(value = "Provider to delete"  ) @RequestBody Provider provider) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<List<Provider>> searchProvider(@ApiParam(value = "pass an optional search id for looking up provider") @RequestParam(value = "idProvider", required = false) String idProvider) {
        // do some magic!
        return new ResponseEntity<List<Provider>>(HttpStatus.OK);
    }

}
