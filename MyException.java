package com.bajaj.day3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

class CustomException extends Exception
{

	public CustomException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
	
	
}
public class MyException {
	

	
	public static void myMain()
	{
		String a[]=new String[10];
		MyException.main(a);
	}
	
	public static void main(String args[]) 
	{
	
		
	
	    int a=10;
	    int b=0;
	    int c=a/b;
		
		
		String str=null;
		if(str!=null)
		{
		if(str.equalsIgnoreCase("hello"))
		{
			
		}
		}
		
		int a[]=new int[0];
		 try
		 {
		 if(a.length==1)
		 {
		 a[0]=1;
		 
		
		 }
		 else
		 {
			 throw new CustomException("There is no space in array to fill this element");
		 }
			File file=new File("C/:");
			file.getAbsoluteFile();
			
			FileInputStream inputStream=new FileInputStream(file);
			
		 System.out.println(a[0]); 
		 }
		 catch(ArrayIndexOutOfBoundsException e)
		 {
			
		  e.printStackTrace();
		   
		 }
		 catch(CustomException e)
		 {
			
		  e.printStackTrace();
		   
		 }
		 catch(FileNotFoundException e)
		 {
			
		  e.printStackTrace();
		   
		 }
		 catch(Exception e)
		 {
			
		  e.printStackTrace();
		   
		 }
		 finally
		 {
			 System.out.println(" i am finally block");
		 }
		 
		
		
	}

}
