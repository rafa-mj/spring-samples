package com.rmj.resteasy.sample.api.v1;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("sample/api/v1")
@Consumes(value = MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public interface UserService {

    /**
     * Creates the user on the system
     *
     * @param auth
     * @param organizationId
     * @return
     * @throws ApiException
     */
    @POST
    @Path("/organization/{organizationId}/users")
    public User createUser(@HeaderParam("auth") String auth, @PathParam("organizationId") Long organizationId) throws ApiException;

    /**
     * Returns the details of the user
     *
     * @param id user identifier
     * @param auth auth token
     * @return user model
     * @throws com.rmj.resteasy.sample.api.v1.ApiException
     */
    @GET
    @Path("/organization/{organizationId}/users/{id}")
    public User getUser(@HeaderParam("auth") String auth, @PathParam("id") String id) throws ApiException;

}
