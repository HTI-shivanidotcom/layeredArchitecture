package com.hsbc.persistance;

import java.util.ArrayList;

import com.hsbc.business.Employee;

public class StorageImpList implements Storage{
	
	private static ArrayList<Employee> employees=new ArrayList<>();

	@Override
	public void addEmployee(Employee e) throws EmployeeAlreadyExistsException {
		for(Employee emp:employees) {
			if(emp.getEmpid()==e.getEmpid()) {
				throw new EmployeeAlreadyExistsException("Employee already there");
			}
		}
		employees.add(e);
	}

	@Override
	public Employee getEmployee(int empid) throws EmployeeNotFoundException {
		for(Employee emp:employees) {
			if(emp.getEmpid()==empid) {
				return emp;
			}
		}
		throw new EmployeeNotFoundException("Employee not found!");
	}

	@Override
	public String deleteEmployee(int empid) throws EmployeeNotFoundException {
		for(Employee emp:employees) {
			if(emp.getEmpid()==empid) {
				employees.remove(emp);
				return "Employee deleted";
			}
		}
		throw new EmployeeNotFoundException("Employee not found");
	}

	@Override
	public String toString() {
		return "StorageImpList []";
	}

	
	
	
	
}
