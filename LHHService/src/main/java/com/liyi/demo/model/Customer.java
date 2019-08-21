package com.liyi.demo.model;

import java.io.Serializable;
import java.util.Date;

import org.apache.ibatis.type.Alias;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Alias("Customer")
@Data
public class Customer implements Serializable{

	private int customerNo; // 客户序号

	private String cname; // 客户名称

	private String contact; // 联系人姓名

	private String cardcode; // 身份证号码

	private String mobile; // 手机号
	
	private String cstatus; // 客户状态
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
	private Date feeStartDate; // 收费开始日期

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
	private Date feeEndDate; // 收费截止日期


}
