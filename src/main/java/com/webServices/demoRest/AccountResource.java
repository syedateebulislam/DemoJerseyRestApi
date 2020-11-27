package com.webServices.demoRest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("account")
public class AccountResource {

	AccountRepository r1=new AccountRepository();

	
	@GET
	@Produces({MediaType.APPLICATION_JSON_PATCH_JSON,MediaType.APPLICATION_XML})
	public List<Account> getAccount() 
	{		
		System.out.println("called...");	
		List<Account> l1=new ArrayList<>();
		
		l1=r1.getAccounts();
		
		
		return l1;
	}
	
	@POST
	@Path("account/{num}")
	@Produces({MediaType.APPLICATION_JSON_PATCH_JSON,MediaType.APPLICATION_XML})
	public Account searchAccount(@PathParam("num") int num) {
		
		
		return r1.searchAccount(num);
		
	}
	
	
	@POST
	@Path("account/create")
	@Produces({MediaType.APPLICATION_JSON_PATCH_JSON,MediaType.APPLICATION_XML})
	public Account createAccount(Account a1)
	{
		System.out.println(a1);
		r1.createAccount(a1);
		
		return a1;
	}
}