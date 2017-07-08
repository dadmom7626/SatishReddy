package com.org.satish;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		  TreeSet<String> al=new TreeSet<String>();  
		  al.add("Ravi");  
		  al.add("Vijay");  
		  al.add("Ravi");  
		  al.add("Ajay");  
		  //Traversing elements  
		  Iterator<String> itr=al.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }  
		  
		  TreeSet<Integer> a2=new TreeSet<Integer>();  
		  a2.add(10);  
		  a2.add(1);  
		  a2.add(6);  
		  a2.add(7);
		  a2.add(4);
		  a2.add(1);
		  
		  //Traversing elements  
		  Iterator<Integer> itr2=a2.iterator();  
		  while(itr2.hasNext()){  
		   System.out.println(itr2.next());  
		  }
	}

}
