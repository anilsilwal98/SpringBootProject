package com.security.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.security.model.Employee;
import com.security.model.DeptEmployee;
import java.util.*;


public interface EmployeeRepository extends JpaRepository<Employee,Long> {

	@Query("SELECT new com.security.model.DeptEmployee(d.name,e.name,e.email,e.address,ph.phNumber) "
			+ "FROM Phone ph INNER JOIN ph.employee e INNER JOIN e.department d")
	List<DeptEmployee> fetchEmpDeptDataInnerJoin();
	
//	@Query("SELECT new com.security.model.DeptEmployee(d.name,e.name,e.email,e.address,ph.phNumber) "
//			+ "FROM Department d, Employee e, Phone ph"
//			+ "WHERE d.employees.id=e.id AND e.phone.id=ph.id")
//	List<DeptEmployee> fetchEmpDeptDataCrossJoin();

}
