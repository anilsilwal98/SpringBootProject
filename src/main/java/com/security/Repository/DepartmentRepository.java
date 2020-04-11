package com.security.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.security.model.Department;
import com.security.model.DeptEmployee;
import java.util.*;


public interface DepartmentRepository extends JpaRepository<Department, Long> {
	
	
	@Query("SELECT new com.security.model.DeptEmployee(d.name, e.name,e.email,e.address, ph.phNumber)" 
			+ "FROM Phone ph LEFT JOIN ph.employee e LEFT JOIN e.department d")
	List<DeptEmployee> fetchEmpDeptDataLeftJoin();
	
	@Query("SELECT new com.security.model.DeptEmployee(d.name, e.name,e.email,e.address,ph.phNumber)" 
			+ "FROM Phone ph RIGHT JOIN ph.employee e RIGHT JOIN e.department d")
	List<DeptEmployee> fetchEmpDeptDataRightJoin();

	
}
