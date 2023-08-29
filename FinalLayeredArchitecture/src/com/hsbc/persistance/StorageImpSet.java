package com.hsbc.persistance;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import com.hsbc.business.Employee;

public class StorageImpSet implements Storage {
    private static Set<Employee> employees = new HashSet<>();

    @Override
    public void addEmployee(Employee e) throws EmployeeAlreadyExistsException {
        if (employees.contains(e)) {
            throw new EmployeeAlreadyExistsException();
        }
        employees.add(e);
    }

//    
//    public List<Employee> showEmployees() {
//        return new ArrayList<>(employees);
//    }

    	
   


	@Override
	public String toString() {
		return "StorageImpSet [employees=" + employees+", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}


	@Override
    public Employee getEmployee(int empId) throws EmployeeNotFoundException {
        for (Employee emp : employees) {
            if (emp.getEmpid() == empId) {
                return emp;
            }
        }
        throw new EmployeeNotFoundException();
    }

    @Override
    public String deleteEmployee(int empId) throws EmployeeNotFoundException {
        Iterator<Employee> iterator = employees.iterator();
        while (iterator.hasNext()) {
            Employee emp = iterator.next();
            if (emp.getEmpid() == empId) {
                iterator.remove();
                return "Employee deleted successfully";
            }
        }
        throw new EmployeeNotFoundException();
    }
}