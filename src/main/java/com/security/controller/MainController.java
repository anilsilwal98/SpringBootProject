package com.security.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.security.model.Department;
import com.security.model.DeptEmployee;
import com.security.service.ServiceClass;

@RestController
public class MainController {
	
	@Autowired
	private ServiceClass serClass;
	
	@GetMapping("/insertData")
	public List<Department> insert() {
		return this.serClass.inData();
	}

	@GetMapping("/innerJoin")
	public List<DeptEmployee> fetchEmpDeptDataInnerJoin() {
		return this.serClass.fetchEmpDeptDataInnerJoin();
	}

	@GetMapping("/leftJoin")
	public List<DeptEmployee> fetchEmpDeptDataLeftJoin() {
		return this.serClass.fetchEmpDeptDataLeftJoin();
	}

	@GetMapping("/rightJoin")
	public List<DeptEmployee> fetchEmpDeptDataRightJoin() {
		return this.serClass.fetchEmpDeptDataRightJoin();
	}

}
