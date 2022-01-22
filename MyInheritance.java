package com.bajaj.day2;


class A
{
/
 int a;

A(int a)
{
	this.a=a;
}

A()
{
	
}

A(int a,int b)
{
	
}

public A(int i, int j, int k) {
	// TODO Auto-generated constructor stub
}
public void printA() {
	System.out.println("A class");
}
}
//extends -
//class name
class B extends A
{
	 
	 
	 B(int a)
	{
		  super();		
		  System.out.println("A  ");		 
	}
	
	public void printB()
	{   
		System.out.println("B class " + a);

	}
}



public class MyInheritance {
	
	public static void main(String args[])
	{
		
		B obj=new B(200);
		System.out.println(obj.a);

		obj.printA();
		obj.printB();
	}

}
