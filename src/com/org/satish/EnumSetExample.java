package com.org.satish;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

enum days1 {  
	  SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY  
	}  

public class EnumSetExample {

	public static void main(String[] args) {
		Set<days1> set =  EnumSet.of(days1.TUESDAY, days1.WEDNESDAY);  
	    // Traversing elements  
	    Iterator<days1> iter = set.iterator();  
	    while (iter.hasNext())  
	      System.out.println(iter.next());  
	  }  
	}


