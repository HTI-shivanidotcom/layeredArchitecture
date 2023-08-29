package com.hsbc.data;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.hsbc.business.Employee;

import Exceptions.EmployeeAlreadyExistsException;
import Exceptions.EmployeeNotFoundException;

public class StorageListImpl implements Storage {

	private static ArrayList<Employee> employees = new ArrayList<>();

	@Override
	public void addEmployee(Employee e) throws EmployeeAlreadyExistsException {
		// TODO Auto-generated method stub
		for (Employee emp : employees) {
			if (emp.getEmpid() == e.getEmpid()) {
				// if equals employee already exists
				throw new EmployeeAlreadyExistsException("Employee already exists");

			}
		}
		employees.add(e);

	}

	@Override
	public Employee getEmployee(Employee e) throws EmployeeNotFoundException {
		// TODO Auto-generated method stub
		for (Employee emp : employees) {
			if (emp.getEmpid() == e.getEmpid()) {
				return emp;
			}
		}
		throw new EmployeeNotFoundException("Employee not found : " + e.getEmpid());
	}

	@Override
	public List<Employee> showEmployee() {
		// TODO Auto-generated method stub
		return employees;
	}

	@Override
	public String deleteEmployee(int empid) throws EmployeeNotFoundException {
		String message = null;
		Iterator<Employee> iterator = employees.iterator();

		while (iterator.hasNext()) {
			Employee employee = iterator.next();
			if (employee.getEmpid() == empid) {
				iterator.remove();
				message = "Employee deleted!";
				break; // Found and removed the employee
			}
		}
		 throw new EmployeeNotFoundException("no employee found");
	}

}
