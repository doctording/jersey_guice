package com.mb.http;

import com.google.inject.Inject;
import com.google.inject.name.Named;
import com.mb.service.UserService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * @Author mubi
 * @Date 2018/12/25 3:04 PM
 */

@Path("useresource")
public class UserResource {

    @Inject
    @Named("User") private UserService userService;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getUserMsg() {
        String msg = userService.process();
        return msg;
    }
}
