package com.liyi.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.liyi.demo.model.Customer;

@Mapper
public interface ICustomerMapper {

	public List<Customer> selectListByAll() throws Exception;
}
