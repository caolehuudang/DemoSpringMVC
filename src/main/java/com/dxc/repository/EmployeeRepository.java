package com.dxc.repository;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.dxc.model.Employee;

@Repository
public class EmployeeRepository {
	ArrayList<Employee> listEmployee = new ArrayList<Employee>();

	public boolean authenticate(Employee employee) {
		for(Employee em : listEmployee) {
			if(employee.getName().equals(em.getName()) && employee.getAge() == em.getAge()) {
				return true;
			}
		}
		return false;
	}
	
	public void createEmployee(Employee employee) {
		if(employee.getName() != "" && employee.getAge() > 18) {
			listEmployee.add(employee);
		}
		System.out.println(listEmployee);
	}
}
