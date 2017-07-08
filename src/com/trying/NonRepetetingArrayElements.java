package com.trying;

import java.util.ArrayList;
import java.util.ListIterator;

public class NonRepetetingArrayElements {

	public static void main(String[] args) {
ArrayList list = new ArrayList<>();
list.add(3);
list.add(4);
list.add(1);
list.add(3);
list.add(1);
list.add(7);
list.add(2);
list.add(2);
list.add(4);
ListIterator itr = list.listIterator();
int count=1;
for (Object object : list) {
	for (Object object1 : list) {
	if(object==object1){
	count++;
	continue;
	}
	}
	if(count>=2)
		System.out.println(object);
count=1;
}
}
	}

