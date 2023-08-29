package com.hsbc.persistance;

import com.hsbc.business.Employee;

public interface Storage {
	void addEmployee(Employee e) throws EmployeeAlreadyExistsException;
	Employee getEmployee(int empid) throws EmployeeNotFoundException;
	String deleteEmployee(int empid) throws EmployeeNotFoundException;
}
