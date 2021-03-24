package com.pluralsight.SpringBootDemo.controllers;

import java.util.Optional;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;
import javax.ws.rs.core.Response.Status;

import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.pluralsight.SpringBootDemo.model.Users;
import com.pluralsight.SpringBootDemo.services.UsersService;

@Path("/users")
public class UsersController {
	
	ObjectWriter json=new ObjectMapper().writer().withDefaultPrettyPrinter();
	@Autowired
	UsersService service;
	@GET
	@Path("/getUsers")
	@Produces({MediaType.APPLICATION_JSON})
	public Response getUsers(@QueryParam(value = "id") Long id, @QueryParam(value = "username") String username,@QueryParam(value = "lastname") String lastname) throws JsonProcessingException {
		ResponseBuilder response=null;
		Users users2=service.getUsers(id, username,lastname);
		ObjectWriter mapper=new ObjectMapper().writer().withDefaultPrettyPrinter();
		String json=mapper.writeValueAsString(users2);
		boolean present=Optional.ofNullable(users2).isPresent();
		if(present) {
			response=Response.ok(json,MediaType.APPLICATION_JSON);
		}else {
			response=Response.status(Response.Status.NOT_FOUND);
		}
		return response.build();
	}
	
	@POST
	@Path("/adduser")
	@Produces({MediaType.APPLICATION_JSON})
	@Consumes({MediaType.APPLICATION_JSON})
	public String addUser(Users users) {
		String builder=null;
		builder= service.saveUser(users);
		return builder;
		
	}
	
	@GET
	@Path("/getUserNativeQuery")
	public Response getUsersByNativeQuery(@QueryParam(value = "id") Long id) throws JsonProcessingException {
		ResponseBuilder res=null;
		Users users= service.getUsers(id);
		boolean present=Optional.ofNullable(users).isPresent();
		if(present) {
			ObjectWriter json=new ObjectMapper().writer().withDefaultPrettyPrinter();
			String jaon=json.writeValueAsString(users);
			res=Response.ok(jaon,MediaType.APPLICATION_JSON);
		}else {
			res=Response.status(Status.NOT_FOUND);
		}
		return res.build();
		
	}
	
	@GET
	@Path("users/usersByUsername")
	public ResponseBuilder getUserbySqlQuery(@QueryParam(value = "username") String username) throws JsonProcessingException {
		ResponseBuilder builder=null;
		Users users=service.getUserBySqlQuey(username);
		
		if(Optional.ofNullable(users).isPresent()) {
			String jsson=json.writeValueAsString(users);
			builder=Response.ok(json, MediaType.APPLICATION_JSON);
		}else {
			builder=Response.status(Status.NOT_FOUND);
			builder=Response.status(404, "Notuser found");
		}
		
		return builder;
		
		
	}
	
}
