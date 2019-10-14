package com.wego.web.serviceimpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wego.web.domains.DepartmentDTO;
import com.wego.web.domains.EmployeeDTO;
import com.wego.web.services.EmployeeService;
@Service
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired EmployeeServiceImpl mapper;
	
	private EmployeeServiceImpl() {}

	@Override
	public void join(EmployeeDTO param) {
		System.out.println("서비스 조인!!!!"+param.toString());
		
		
	}

	@Override
	public EmployeeDTO login(EmployeeDTO param, DepartmentDTO db) {

		return null;
	}

}