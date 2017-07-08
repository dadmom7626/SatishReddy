package com.org.practice.satish;

import java.util.ArrayList;
import java.io.*;
import java.util.Collections;
import java.util.List;

public class Student {
int id;
String name;
double fee;
public Student(int id, String name, double fee) {
	super();
	this.id = id;
	this.name = name;
	this.fee = fee;
}
	public static void main(String[] args) {
		ArrayList<Student>al=new ArrayList<Student>();  
		al.add(new Student(101,"Vijay",23.2));  
		al.add(new Student(106,"Ajay",25.8));  
		al.add(new Student(105,"Jai",23.21));  
		//Collections.sort(al);  //Errory rectification needed
		for(Student st:al){  
		System.out.println(st.id+" "+st.name+" "+st.fee); 
		if(st.name=="Jai")
			System.out.println("Ajay is in class");
		
	}
}

}