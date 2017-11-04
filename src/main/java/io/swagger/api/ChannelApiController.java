package io.swagger.api;

import io.swagger.model.Channel;

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
public class ChannelApiController implements ChannelApi {

    public ResponseEntity<Void> addChannel(@ApiParam(value = "Channel to add"  ) @RequestBody Channel channel) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> deleteChannel(@ApiParam(value = "Channel to delete"  ) @RequestBody Channel channel) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<List<Channel>> searchChannel(@ApiParam(value = "pass an optional search id for looking up channel") @RequestParam(value = "idChannel", required = false) String idChannel) {

        // do some magic!
        return new ResponseEntity<List<Channel>>(HttpStatus.OK);
    }

}
