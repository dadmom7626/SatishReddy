package com.trying;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Student {
	String name;
	int id;
	String medium;
	int grade;
	static{
		System.out.println("VVLSH");
	    //System.exit(0); // exits without executing other statements

	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMedium() {
		return medium;
	}
	public void setMedium(String medium) {
		this.medium = medium;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public static void main(String[] args) {
		Student s1=new Student();
		s1.setName("Venkat");
		s1.setId(1);
		s1.setMedium("Telugu");
		s1.setGrade(10);
		
		Student s2=new Student();
		s2.setName("Laxmi");
		s1.setId(2);
		s1.setMedium("Telugu");
		s1.setGrade(9);
		
		Student s3=new Student();
		s3.setName("Harika");
		s3.setId(3);
		s3.setMedium("Telugu");
		s3.setGrade(8);
		
		Student s4=new Student();
		s4.setName("Satish");
		s4.setId(4);
		s4.setMedium("Telugu");
		s4.setGrade(7);
		
		
		ConcurrentHashMap<Student ,String > map=new ConcurrentHashMap<>();
		map.put(s1, "1");
		map.put(s2, "2");
		map.put(s3, "3");
		map.put(s4, "4");
		
	    for(Map.Entry<Student, String> entry:map.entrySet()){    
	    	Student key=entry.getKey();  
	        String s=entry.getValue();  
	        System.out.println("Name is:"+key.getName()+"  "+"Id is:"+key.getId()+"  "+"Medium is:"+key.getMedium()+"  "+"Grade is:"+key.getGrade());  
	        System.out.println(s);   	
			
	    }

	}

}
