package com.org.satish;

import java.util.Hashtable;
import java.util.Map;

public class HashTableExample {

	public static void main(String[] args) {
		Hashtable<Integer,String> hm=new Hashtable<Integer,String>();  
		  
		  hm.put(100,"Amit");  
		  hm.put(102,"Ravi");  
		  hm.put(101,"Vijay");  
		  hm.put(103,"Rahul");  
		  
		  for(Map.Entry m:hm.entrySet()){  
		   System.out.println(m.getKey()+" "+m.getValue());  
		  }  
		  
		  
		  Hashtable<Integer, String> map = new Hashtable<Integer, String>();           
		   map.put(102,"Let us C");  
		   map.put(103, "Operating System");  
		   map.put(101, "Data Communication and Networking");  
		   System.out.println("Values before remove: "+ map);    
		   // Remove value for key 102  
		   map.remove(102);  
		   System.out.println("Values after remove: "+ map);  
	}

}
