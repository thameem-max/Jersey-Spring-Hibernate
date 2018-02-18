package com.mindtree.JSH.service;

import in.benchresources.cdm.customer.CustomerListType;
import in.benchresources.cdm.customer.CustomerType;
 
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
 
import org.springframework.web.servlet.ModelAndView;


@Path("/rest/app")
public interface ICustomerService {
	
	// http://localhost:8080/JSH/rest/app/start
	@GET
    @Path("/start")
    @Produces({MediaType.TEXT_PLAIN})
	@Consumes({MediaType.TEXT_PLAIN})
    public String startWebService();
 
    // Basic CRUD operations for Customer Service
 
    //http://localhost:8080/JSH/rest/app/add
    @POST
    @Path("/add")
    @Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @Produces({MediaType.APPLICATION_FORM_URLENCODED})
    public String createOrSaveNewCustomerInfo(CustomerType customerType);
 
    // http://localhost:8080/JSH/rest/app/get/{id}
    @GET
    @Path("/get/{id}")
    @Consumes({MediaType.APPLICATION_FORM_URLENCODED})
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public CustomerType getCustomerInfo(@PathParam("id") int customerId);
 
    // http://localhost:8080/JSH/rest/app/getalcustomer
    @GET
    @Path("/getalcustomer")
    @Consumes({MediaType.APPLICATION_FORM_URLENCODED})
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public CustomerListType getAllCustomerInfo();
 
}