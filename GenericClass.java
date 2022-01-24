package com.bajaj.day3;


class Employee<T,V,Z>
{

 private A id;

 private B name;
 private C salary;
 
 Employee(A id, B name,  C salary)
 {
	this.id=id;
	this.name=name;
	this.salary=salary;
 }
}



public class GenericClass {
	
	public static void main(String args[])
	{
       Employee<Long,String,Long> e2=new Employee(1,"Khwaab",2000);
    
       Employee<Double,String,Long> e3=new Employee(2,"Sahil",400);
       
       
       
	}

}
