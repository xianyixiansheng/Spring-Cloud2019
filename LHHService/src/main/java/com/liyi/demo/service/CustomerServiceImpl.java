package com.liyi.demo.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.liyi.demo.mapper.ICustomerMapper;
import com.liyi.demo.model.Customer;

@Service
@Transactional
public class CustomerServiceImpl implements ICustomerService {

	@Autowired
	private ICustomerMapper mapper;
	
	@Override
	public List<Customer> getListByAll() throws Exception {
		return mapper.selectListByAll();
	}

}
