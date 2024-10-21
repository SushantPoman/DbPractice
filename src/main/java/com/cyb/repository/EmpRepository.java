package com.cyb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cyb.entities.Employee;

public interface EmpRepository extends JpaRepository<Employee, Integer>{

	@Query(value = "select * from employee e inner join contact c on e.eid = c.employee_eid where c.detail=:detail", nativeQuery = true)
	Employee findByDetail(String detail);
	
}
