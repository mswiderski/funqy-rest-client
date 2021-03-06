package org.acme.funqy.cloudevent;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@Path("/v2")
@RegisterRestClient
public interface UsersRemoteService {

    @GET
    @Path("/user/{username}")
    @Produces("application/json")
    User get(@PathParam("username") String username);
}
