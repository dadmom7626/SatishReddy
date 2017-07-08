package com.org.satish;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {
		HashSet<Integer> set=new HashSet<Integer>();
		set.add(0);
		set.add(9);
		set.add(5);
		set.add(3);
		set.add(6);
		set.add(0);
		set.add(1);
		set.add(8);
		
		Iterator<Integer> itr=set.iterator(); 
		while(itr.hasNext()){
			System.out.println(itr.next());

	}
	}
}
