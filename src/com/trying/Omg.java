package com.trying;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.ConcurrentHashMap;

public class Omg   {
	public static void main(String[] args)   {
		LinkedList list = new LinkedList();
		list.add(1);
		list.add(0);
		list.add(1);
		list.add(1);
		list.add(0);
		list.add(0);
		ListIterator itr = list.listIterator();
		System.out.println(itr.previousIndex());
		System.out.println(itr.nextIndex());
		System.out.println(itr.nextIndex());
		System.out.println(itr.nextIndex());
		System.out.println(list.listIterator().next());
		System.out.println(list.listIterator().next());
		System.out.println(list.parallelStream());

ConcurrentHashMap<Integer , String> map=new ConcurrentHashMap<>();
map.put(0, "Satish");
map.put(5, "VVLSH");
System.out.println(map.get(5));
	}}