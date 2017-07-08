package com.trying;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class ReturnArrayList {
	
	
	@SuppressWarnings("unchecked")
	public LinkedList add()
	{
		LinkedList list = new LinkedList<>();

		for(int i=0;i<=5;i++){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		list.add(s);
		}
Collections.sort(list);	
System.out.println("Ascending Order"+list);
Collections.unmodifiableList(list);
Collections.shuffle(list);//Shuffled
System.out.println("Shuffled Order"+list);
Collections.reverse(list);;
list.add("abc");
System.out.println("Descending Order"+list);
return list;
		
	}

	public static void main(String[] args) {
		ReturnArrayList r = new ReturnArrayList();
		r.add();
	}

}
