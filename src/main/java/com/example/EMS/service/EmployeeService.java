package com.example.EMS.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.EMS.EmployeeRepository;
import com.example.EMS.entity.Employee;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository emprepo;

	public void addEmp(Employee e) {
		emprepo.save(e);
	}
	
	public List<Employee> getAllEmp(){
		return emprepo.findAll();
	}
	
	public Employee getEmpById(int id) {
		
		Optional<Employee> e = emprepo.findById(id);
		if (e.isPresent()) {
			return e.get();
		}
		return null;
	}
}
