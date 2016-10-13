/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oving4;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author OddErik
 */
@Path("/oving4/")
public class Oving4 {

    @Context
    private UriInfo context;
    private static String msg = "Test";

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getText() {
                
        return msg;
    }

    @POST
    @Consumes(MediaType.TEXT_PLAIN)
    public void setText(String content) {
        msg = content;
    }
}
