package com.security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.security.Repository.DepartmentRepository;
import com.security.Repository.EmployeeRepository;
import com.security.Repository.PhoneRepository;
import com.security.model.Department;
import com.security.model.DeptEmployee;
import com.security.model.Employee;
import com.security.model.Phone;

import java.util.*;


@Service
public class ServiceClass {
	
	@Autowired
	private DepartmentRepository deptRepo;
	
	@Autowired
	private EmployeeRepository empRepo;

	@Autowired
	private PhoneRepository phRepo;
	
	public List<DeptEmployee> fetchEmpDeptDataInnerJoin(){
		return this.empRepo.fetchEmpDeptDataInnerJoin();
	}
	
//	public List<DeptEmployee> fetchEmpDeptDataCrossJoin(){
//		return this.empRepo.fetchEmpDeptDataCrossJoin();
//	}

	public List<DeptEmployee> fetchEmpDeptDataLeftJoin(){
		return this.deptRepo.fetchEmpDeptDataLeftJoin();
	}

	public List<DeptEmployee> fetchEmpDeptDataRightJoin(){
		return this.deptRepo.fetchEmpDeptDataRightJoin();
	}

	public List<Department> inData() {

		
		Department d = new Department("Computer", "Blah Blah Blah");
		this.deptRepo.save(d);
		
		Employee e = new Employee("Anil","geeksilwal@gmail.com","sanothimi");
		e.setDepartment(d);
		this.empRepo.save(e);

		Employee e1 = new Employee("Ashok","ashoksilwal@gmail.com","USA");
		e1.setDepartment(d);
		this.empRepo.save(e1);
		
		Phone ph = new Phone("9062759442");
		ph.setEmployee(e);
		this.phRepo.save(ph);
		
		Phone ph1 = new Phone("9062759443");
		ph1.setEmployee(e1);
		this.phRepo.save(ph1);
		
		
		List<Department> d1 = this.deptRepo.findAll();
		return d1;
		
	}

	

}
