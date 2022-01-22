package com.bajaj.helloworld;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Collectors;
//import java.util.lists;

class Patient{
	int PatientId;  
	
    String PatientName;  
    
    float fees;  
    
    public Patient(int PatientId, String PatientName, float fees) {  
        this.PatientId = PatientId;  
        this.PatientName = PatientName;  
        this.fees = fees;  
    }  
}  


public class JavaStreamExample {
	public static void main(String [] args) {
		List<Patient> patientList = new ArrayList<Patient>();  
        
		patientList.add(new Patient(1,"Khwaab",250f));  
		patientList.add(new Patient(2,"Sahil",300f));  
		patientList.add(new Patient(3,"Aditya",280f));  
		patientList.add(new Patient(4,"Rahul",800f));  
        patientList.add(new Patient(5,"Prateek",900f));  
        
        
        // patient with id =3
        patientList.stream()  
                             .filter(patient -> patient.PatientId == 3)  
                             .forEach(patient -> System.out.println(patient.PatientName));   
        System.out.println("--------------");
        
        
//        patients who's name ends with l
        patientList.stream()  
        					.filter(patient ->patient.PatientName.endsWith("l"))
        					.forEach(patient -> System.out.println(patient.PatientName));
        System.out.println("--------------");
        
        
        // name with length greater than 6
        List<String> names = Arrays.asList("Khwaab","Sahil","Aditya","Rahul","Prateek");
    	Stream<String> allNames = names.stream();   	
    	Stream<String> longNames = allNames.filter(str -> str.length() > 6);
    	longNames.forEach(str->System.out.print(str+" "));
    	System.out.println("--------------");
        
    	// name with length greater than 6 but using collectors
    	List<String> longnames = names.stream()    
                .filter(str -> str.length() > 6)   
                .collect(Collectors.toList());  
        
        
        System.out.println("--------------");
        
        
        // Max Fees
        longnames.forEach(System.out::println);   
        Integer Fees = Stream.of(250, 300, 280, 800, 900)
                .max(Comparator.comparing(Integer::valueOf))
                .get();
        System.out.println("--------------");
        
        
        
        // Min fees
        Integer Fees2 = Stream.of(250, 300, 280, 800, 900)
                .min(Comparator.comparing(Integer::valueOf))
                .get();
        System.out.println("--------------");

		System.out.println("Max Fees paid for the visit is: " + Fees);
		System.out.println("--------------");
		System.out.println("Min Fees paid for the visit is: " + Fees2);
		System.out.println("--------------");
		
		
		//Sorting using stream.sort()
		System.out.println("Sorted list is: ");
		names.stream().sorted().forEach(System.out::println);
		System.out.println("--------------");
		
		
		//Count of patients
		System.out.print("Total count of patients is: ");
		long total = names.stream().count();
		System.out.println(total);
		System.out.println("--------------");
		
		
		//
		List<Integer> Fees3 = Arrays.asList(250, 300, 280, 800, 900);
		int sum = Fees3.stream().mapToInt(Integer::intValue).sum();
		System.out.println("Total : " + sum);

  
	}

}
