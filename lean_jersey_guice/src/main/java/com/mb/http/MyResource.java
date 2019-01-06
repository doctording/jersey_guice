package com.mb.http;

import com.google.inject.Inject;
import com.mb.service.MyAppService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * @Author mubi
 * @Date 2018/12/25 3:04 PM
 */

@Path("myresource")
public class MyResource {

    @Inject
    MyAppService myAppService;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getWork() {
        return myAppService.work();
    }
}
