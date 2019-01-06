package com.mb.http;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * @Author mubi
 * @Date 2018/12/25 3:04 PM
 */

@Path("myresource")
public class MyResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
        return "Got it!";
    }
}
