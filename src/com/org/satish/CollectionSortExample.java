package com.org.satish;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class CollectionSortExample {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();  
		al.add("Viru");  
		al.add("Saurav");  
		al.add("Mukesh");  
		al.add("Tahir");  
		  
		Collections.sort(al);  
		Iterator itr=al.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		 }  
		
		
		
		ArrayList a2=new ArrayList();  
		a2.add(Integer.valueOf(201));  
		a2.add(Integer.valueOf(101));  
		a2.add(230);//internally will be converted into objects as Integer.valueOf(230)  
		  
		Collections.sort(a2);  
		  
		Iterator itr2=a2.iterator();  
		while(itr2.hasNext()){  
		System.out.println(itr2.next());  
		 }  
	}

}
