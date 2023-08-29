package com.hsbc.data;
import java.util.List;

import com.hsbc.business.Employee;

import Exceptions.EmployeeAlreadyExistsException;
import Exceptions.EmployeeNotFoundException;

public interface Storage {
	void addEmployee(Employee e) throws EmployeeAlreadyExistsException;
	Employee getEmployee(Employee e) throws EmployeeNotFoundException;
	List<Employee> showEmployee();
	String deleteEmployee(int empid) throws EmployeeNotFoundException;
}
