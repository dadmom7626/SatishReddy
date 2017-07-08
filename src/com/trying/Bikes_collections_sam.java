package com.trying;

import java.util.ArrayList;
import java.util.Scanner;

public class Bikes_collections_sam {

 public static void main(String[] args) {
  Scanner s = new Scanner(System.in);
  
  ArrayList<Bikes> store = new ArrayList<Bikes>();

  System.out.println("enter the no bikes");
  int items = s.nextInt();
  Factory o1 = new Factory();
  store = o1.generate(items);
  System.out.println("Bikes generated");
  for (int k = 0; k < items; k++) {
   System.out.println((store.get(k)).toString());
  }
 }
}

class Factory {

 ArrayList generate(int item) {
  ArrayList<Bikes> bikes = new ArrayList();
  for (int i = 0; i < item; i++) {
   bikes.add(new Bikes(i));
  }
  return bikes;

 }

}

class Bikes {

 int bike_id;

 Bikes(int item1) {
  this.bike_id = item1;
 }

 @Override
 public String toString() {
	 return "Bikes [bike_id=" + bike_id + "]";
 }
}