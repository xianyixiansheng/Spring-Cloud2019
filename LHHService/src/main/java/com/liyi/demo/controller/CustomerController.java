package com.liyi.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.liyi.demo.model.Customer;
import com.liyi.demo.service.ICustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	private ICustomerService service;
	
	@GetMapping(value = "/list/all")
	public List<Customer> getListByAll() throws Exception
	{
		return service.getListByAll();
	}
	
}
