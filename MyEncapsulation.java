package com.bajaj.Mypackage;


class Employee1
{
	
	private String username;
	private int password;

	public void login(String username, int password)
	{
		
	System.out.println("working on System");	
		
	}
	
	
}


public class MyEncapsulation {
	
	public static void main(String args[])
	{
		Employee1 s1=new Employee1();
		s1.login("root", 12345);
		
	}

}
