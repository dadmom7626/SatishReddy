package com.org.satish;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapExample {

	public static void main(String[] args) {
		HashMap<String,Integer> hm=new HashMap<String,Integer>();  
		//Map<String,Integer> hm=new HashMap<String,Integer>(); //second way of declaration 

		  hm.put("Munagala",175);  
		  hm.put("Vijayawada",300);  
		  hm.put("Suryapet",150);  
		  System.out.println("Key and Values"+hm);
		  for(Map.Entry m:hm.entrySet()){  
		  System.out.println(m.getKey()+" "+m.getValue()); 
		   
		  } 

	}

}
