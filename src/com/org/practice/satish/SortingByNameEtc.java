package com.org.practice.satish;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class SortingByNameEtc {
	int id;
	String name;
	double fee;
	public SortingByNameEtc(int id, String name, double fee) {
		super();
		this.id = id;
		this.name = name;
		this.fee = fee;
	}
		public static void main(String[] args) {
			ArrayList al=new ArrayList();  
			al.add(new Student(101,"Vijay",23));  
			al.add(new Student(106,"Ajay",27));  
			al.add(new Student(105,"Jai",21));  
			  
			System.out.println("Sorting by Name...");  
			  
			//Collections.sort(al,new NameComparator());  //Errory rectification needed
			Iterator itr=al.iterator();  
			while(itr.hasNext()){  
			Student st=(Student)itr.next();  
			System.out.println(st.id+" "+st.name+" "+st.fee);  
			}  
			  
			System.out.println("sorting by age...");  
			  
			//Collections.sort(al,new AgeComparator());  //Errory rectification needed
			Iterator itr2=al.iterator();  
			while(itr2.hasNext()){  
			Student st=(Student)itr2.next();  
			System.out.println(st.id+" "+st.name+" "+st.fee);  
			}  
	}

}
