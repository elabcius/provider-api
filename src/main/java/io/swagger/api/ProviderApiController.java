package io.swagger.api;

import io.swagger.model.Channel;
import io.swagger.model.Provider;

import io.swagger.annotations.*;

import org.springframework.hateoas.Link;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import util.ProviderUtil;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-11-04T14:39:56.794Z")

@Controller
public class ProviderApiController implements ProviderApi {

    private ProviderUtil providerUtil = new ProviderUtil();

    public ResponseEntity<Void> addProvider(@ApiParam(value = "Provider to add") @RequestBody Provider provider) {
        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.set("Provider", "addProvider");

        providerUtil.addMockProvider(provider);
        return new ResponseEntity<Void>(responseHeaders, HttpStatus.OK);
    }

    public ResponseEntity<Void> deleteProvider(@ApiParam(value = "Provider to delete") @RequestBody Provider provider) {
        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.set("Provider", "addProvider");

        providerUtil.deleteProvider(provider);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<List<Provider>> searchProvider(@ApiParam(value = "pass an optional search id for looking up provider") @RequestParam(value = "idProvider", required = false) String idProvider) {
        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.set("Provider", "searchProvider");
        return new ResponseEntity<List<Provider>>(getProviderList(idProvider), responseHeaders, HttpStatus.OK);
    }

    private List<Provider> getProviderList(String idProvider) {
        List<Provider> providerList = new ArrayList<>();
        if(idProvider != null && !idProvider.equals("")){
            providerList = providerUtil.getMockOneProviderList(idProvider);
        }
        else{
            providerList = providerUtil.getMockProviderList();
        }
        for (Provider provider : providerList) {
            if (CollectionUtils.isEmpty(provider.getLinks())) {
                provider.add(addLinkToProvider(provider));
            }
            getChannelList(provider.getChannel());
        }
        return providerList;
    }

    private List<Channel> getChannelList(List<Channel> channelListEntry){
        List<Channel> channelList = channelListEntry;
        for (Channel channel: channelList){
            if (CollectionUtils.isEmpty(channel.getLinks())) {
                channel.add(addLinkToChannel(channel));
            }
        }
        return  channelList;
    }

    private Link addLinkToProvider(Provider provider){
       return linkTo(methodOn(ProviderApiController.class).searchProvider(provider.getProviderId())).withSelfRel();
    }

    private Link addLinkToChannel(Channel channel){
        return linkTo(methodOn(ChannelApiController.class).searchChannel(channel.getChannelId())).withSelfRel();
    }

}
