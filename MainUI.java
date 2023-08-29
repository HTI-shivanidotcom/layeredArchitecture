package com.hsbc.ui;
import java.util.Scanner;

import Exceptions.EmployeeAlreadyExistsException;
import Exceptions.EmployeeNotFoundException;

public class MainUI {
	public static void main(String[] args) throws EmployeeAlreadyExistsException, EmployeeNotFoundException {
		UserUI ui=new UserUI();
		System.out.println("1. add employee");
		System.out.println("2. get employee");
		System.out.println("3. show employees");
		System.out.println("4. delete employees");
		System.out.println("5. exit ");
		int choice=0;
		do {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter your choice!");
			choice=sc.nextInt();
		switch(choice) {
			case 1:
				// adding an employee
				System.out.println("you are adding emp name");
				ui.acceptEmpDetailsAndStore();
				break;
			case 2:
				System.out.println("you are checking the display of employees");
				ui.displayEmpByEmpno();
				break;
			case 3:
				System.out.println("Checking all the employees!");
				ui.show();
				break;
			case 4:
				System.out.println("you are deleting the emp id");
				ui.delete();
				break;
				
			case 5: 
				System.exit(0);
			default:
				System.out.println("Entered invaild choice");
				break;
		}
		}while(choice!=5);
		
	}
}
