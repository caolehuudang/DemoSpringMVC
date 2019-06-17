package com.dxc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.model.Employee;
import com.dxc.repository.EmployeeRepository;

@Service
public class LoginService {
	@Autowired
	private EmployeeRepository employeeRepository;

	public boolean login(Employee employee) {
		return employeeRepository.authenticate(employee);
	}
	
	public void register(Employee employee) {
		employeeRepository.createEmployee(employee);
	}
}
