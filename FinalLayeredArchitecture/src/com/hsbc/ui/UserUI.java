package com.hsbc.ui;

import java.util.Scanner;

import com.hsbc.business.Employee;
import com.hsbc.persistance.EmployeeAlreadyExistsException;
import com.hsbc.persistance.EmployeeNotFoundException;
import com.hsbc.persistance.Storage;
import com.hsbc.persistance.StorageFactory;

public class UserUI {

	public void acceptEmpDataAndStore(int code) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the employee id");
		int empid=sc.nextInt();
		
		System.out.println("Enter the employee name");
		String empname=sc.next();
		
		System.out.println("Enter the employee city");
		String city=sc.next();
		Employee new_emp=new Employee(empid,empname,city);
		Storage empStorage=StorageFactory.getStorageCode(code);
		try {
			empStorage.addEmployee(new_emp);
		} catch (EmployeeAlreadyExistsException e) {
			System.out.println("Employee already exists");
		}
	}

	public void displayEmpById(int code) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the employee id");
		int empid=sc.nextInt();
		Storage empStorage=StorageFactory.getStorageCode(code);
		try {
			System.out.println(empStorage.getEmployee(empid));
		} catch (EmployeeNotFoundException e) {
			System.out.println("Employee not found");
		}
	}

	public void show(int code) {
		Storage empStorage=StorageFactory.getStorageCode(code);
		System.out.println(empStorage);
	}

	public void delete(int code) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the employee id");
		int empid=sc.nextInt();
		Storage empStorage=StorageFactory.getStorageCode(code);
		try {
			empStorage.deleteEmployee(empid);
		} catch (EmployeeNotFoundException e) {
			System.out.println("Employee not found");
		}
	}

}
