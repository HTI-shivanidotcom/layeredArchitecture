package com.hsbc.ui;
import java.util.Scanner;

import com.hsbc.business.Employee;
import com.hsbc.data.Storage;
import com.hsbc.data.StorageListImpl;

import Exceptions.EmployeeAlreadyExistsException;
import Exceptions.EmployeeNotFoundException;

public class UserUI {
	
	Scanner sc=new Scanner(System.in);

	public void acceptEmpDetailsAndStore() throws EmployeeAlreadyExistsException {
		// TODO Auto-generated method stub
		System.out.println("Enter the emp id");
		int empid=sc.nextInt();
		System.out.println("Enter the emp name");
		String empname=sc.next();
		System.out.println("Enter emp city");
		String city=sc.next();
		Employee new_emp=new Employee(empid,empname,city);
//		System.out.println("Enter the code either 1");
//		int code=sc.nextInt();
//		Storage empStorage=StorageFactory.getStorageCode(code);
		Storage empStorage=new StorageListImpl();
		empStorage.addEmployee(new_emp);
		System.out.println("Employee added successfully!");
		
	}

	public void displayEmpByEmpno()  {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the empid which needs to be searched!");
		int empid=sc.nextInt();
		
		Employee empToFind=new Employee();
		// set employee
		empToFind.setEmpid(empid);
		
		
//		System.out.println("Enter the code either 1");
//		int code=sc.nextInt();
		
		
//		Storage empStorage=StorageFactory.getStorageCode(code);
		Storage empStorage=new StorageListImpl();
		
		
		try {
			System.out.println(empStorage.getEmployee(empToFind));
		} catch (EmployeeNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
		
	}
	
	public void show() {
		
//		System.out.println("Enter the code either 1");
//		int code=sc.nextInt();
		
		
//		Storage empStorage=StorageFactory.getStorageCode(code);
		Storage empStorage=new StorageListImpl();
		System.out.println(empStorage.showEmployee());
		System.out.println("showed employees");
		
	}
	
	public void delete() {
		System.out.println("Enter the empid which needs to be deleted!");
		int empid=sc.nextInt();
//		System.out.println("Enter the code either 1");
//		int code=sc.nextInt();
		
		
//		Storage empStorage=StorageFactory.getStorageCode(code);
		Storage empStorage=new StorageListImpl();
		try {
			System.out.println(empStorage.deleteEmployee(empid));
		} catch (EmployeeNotFoundException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("deleted employees");
		
	}
	
}
