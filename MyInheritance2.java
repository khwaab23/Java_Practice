package com.bajaj.day2;

/

class camera
{
	
	public void printCamera()
	{
		System.out.println("My camera is 10 MP");
	}
}

abstract interface processor
{

	abstract public void printProcessor();
	
}
class Mobile extends camera implements processor 
{

	@Override
	public void printProcessor() {
		// TODO Auto-generated method stub
		
	}
	
}




public class MyInheritance2 {
	
	public static void main(String args[])
	{
		
		
	}

}
