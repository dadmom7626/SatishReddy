package com.org.satish;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
		  list.add("Ravi");//Adding object in arraylist  
		  list.add("Vijay");  
		  list.add("Ravi");  
		  list.add("Ajay");  
		  //Traversing list through Iterator  
		  Iterator itr=list.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }  
		  
		  
		  
		  ArrayList<Integer> list1=new ArrayList<Integer>();//Creating arraylist  
		  list1.add(8);//Adding object in arraylist  
		  list1.add(5);  
		  list1.add(10);  
		  list1.add(6);  
		  list1.add(5);  
		  list1.add(16); 

		  //Traversing list through Iterator  
		  Iterator itr1=list1.iterator();  
		  while(itr1.hasNext()){  
		   System.out.println(itr1.next());  
		  }  
	}

}
