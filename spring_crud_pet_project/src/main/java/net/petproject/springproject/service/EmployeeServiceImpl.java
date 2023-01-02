package net.petproject.springproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.petproject.springproject.model.Employee;
import net.petproject.springproject.repository.EmployeeRepository;
@Service
public class EmployeeServiceImpl implements EmployeeService  {
	
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}

	
}
