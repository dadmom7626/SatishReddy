package com.org.satish;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {

	public static void main(String[] args) {
		LinkedHashMap<Integer,String> hm=new LinkedHashMap<Integer,String>();  
		  
		  hm.put(100,"Amit");  
		  hm.put(102,"Rahul");  
		  hm.put(101,"Vijay");  
		  
		for(Map.Entry m:hm.entrySet()){  
		   System.out.println(m.getKey()+" "+m.getValue());  
		  }  
		
		
		
		 Map<Integer, String> map = new LinkedHashMap<Integer, String>();           
		   map.put(101,"Let us C");  
		   map.put(102, "Operating System");  
		   map.put(103, "Data Communication and Networking");  
		   System.out.println("Values before remove: "+ map);    
		   // Remove value for key 102  
		   map.remove(102);  
		   System.out.println("Values after remove: "+ map);  
	}

}
