package com.hsbc.ui;

import java.util.Scanner;

public class MainUI {
	public static void main(String[] args) {
		UserUI ui=new UserUI();
		System.out.println("1. ADD EMPLOYEE");
		System.out.println("2. GET EMPLOYEE");
		System.out.println("3. SHOW ALL EMPLOYEES");
		System.out.println("4. DELETE EMPLOYEE");
		System.out.println("5. EXITING APPLICATION");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your code - 1,2,3");
		int code=sc.nextInt();
		int choice=0;
		do {
			System.out.println("Enter your choice");
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				ui.acceptEmpDataAndStore(code);
				break;
			case 2: 
				ui.displayEmpById(code);
				break;
			case 3:	
				ui.show(code);
				break;
			case 4:
				ui.delete(code);
				break;
			case 5:
				System.out.println("Exiting application");
				System.exit(0);
			default:
				System.out.println("Enter valid choice");
			}
		}while(choice!=5);
		
	}
}
