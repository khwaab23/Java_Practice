
package com.bajaj.helloworld;
import java.util.*;


class Employee{
	
	private static String ename;
	private static int id;

	Scanner scan=new Scanner(System.in);
	public void enter() {
		System.out.println("enter employee name :");
		name =scan.next();
		System.out.println("enter employee id :");
		id=scan.nextInt();

	}

	public static void printEmployee() {   //display
		System.out.println("Employee name :"+name);
		System.out.println("Employee id : "+id);
	}



	public static int getName(String name,Employee[] emp) {
		for(int i=0;i<emp.length;i++) {
			if(name.equals(emp[i].name)) {
			if(name.emp[i].name) {
				return i;
			}
		}
		return 0;
	}

	public static void updateDetails(int id,Employee emp[]) {
		int n=getId(id,emp);
		System.out.println("Please Enter the new name ");
		emp[n1].name=scan.next();
		emp[n1].printEmployee();
		
	}

	public static void getDetails(String name,Employee emp[]) {
		int n=getName(name,emp);
		emp[n].printEmployee();
	}
	
	
}
public class BankApplication{
	public static void main(String[] args) {

		 Scanner sc=new Scanner(System.in);
		 System.out.println("Select your choice");
		 
		 System.out.println("Enter 1 for create");
		 System.out.println("Enter 2 for append");
		 System.out.println("Enter 3 for delete");
		 System.out.println("Enter 4 for update");
		 System.out.println("Enter 5 for Search by name");
		 System.out.println("Enter 6 for sort ASC");
		 System.out.println("Enter 7 for sort DESC");
		 System.out.println("Enter 8 for Exit");




