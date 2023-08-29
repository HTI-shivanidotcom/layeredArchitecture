package com.hsbc.persistance;

import java.util.HashMap;
import java.util.Map;

import com.hsbc.business.Employee;

public class StorageImpMap implements Storage{
	
	private static Map<Integer,Employee> map=new HashMap<>();

	@Override
	public void addEmployee(Employee e) throws EmployeeAlreadyExistsException {
		if(map.containsKey(e.getEmpid())) {
			throw new EmployeeAlreadyExistsException("Employee already exists");
		}
		map.put(e.getEmpid(), e);
	}

	@Override
	public Employee getEmployee(int empid) throws EmployeeNotFoundException {
		if(map.containsKey(empid)) {
			return map.get(empid);
		}
		throw new EmployeeNotFoundException("Employee Not Found");
	}

	@Override
	public String deleteEmployee(int empid) throws EmployeeNotFoundException {
		if(map.containsKey(empid)) {
			map.remove(empid);
			return "Removed from map";
		}
		throw new EmployeeNotFoundException("Employee not found");
	}

	@Override
	public String toString() {
		return "StorageImpMap [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	

}
