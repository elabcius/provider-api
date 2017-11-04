package io.swagger.api;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.*;

import io.swagger.model.Channel;

import io.swagger.annotations.*;

import io.swagger.model.TvProgramming;
import org.springframework.hateoas.Link;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import util.ChannelUtil;

import java.util.Collections;
import java.util.List;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-11-04T14:39:56.794Z")

@Controller
public class ChannelApiController implements ChannelApi {

    public ResponseEntity<Void> addChannel(@ApiParam(value = "Channel to add"  ) @RequestBody Channel channel) {
        HttpHeaders headers = new HttpHeaders();
        headers.add("status", "OK");

        ChannelUtil.setChannel(channel);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> deleteChannel(@ApiParam(value = "Channel to delete"  ) @RequestBody Channel channel) {
        HttpHeaders headers = new HttpHeaders();
        headers.add("status", "OK");

        ChannelUtil.removeChannel(channel);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<List<Channel>> searchChannel(@ApiParam(value = "pass an optional search id for looking up channel") @RequestParam(value = "idChannel", required = false) String idChannel) {

        List<Channel> channels = ChannelUtil.getChannels();
        channels.forEach(channel -> {
            if (CollectionUtils.isEmpty(channel.getLinks())) {
                Link selfLink = linkTo(methodOn(ChannelApiController.class).searchChannel(channel.getChannelId())).withSelfRel();
                channel.add(selfLink);
            }
        });

        HttpHeaders headers = new HttpHeaders();
        headers.add("providers", "OK");

        return new ResponseEntity<List<Channel>>(channels, headers, HttpStatus.OK);
    }

}
