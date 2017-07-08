package com.interfaces.abstractclass;

public class B extends A {
	public int multiply(int a,int b){
		return a*b;
		
	}
	public int division(int a,int b){
		return a+b;
		
	}
	//@Override
	/*public int abc() {
		// TODO Auto-generated method stub
		return 0;
	}*/
    @Override
	public int xyz(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}


	public static void main(String[] args) {
		B b = new B();
		System.out.println(b.multiply(5, 4));
		System.out.println(b.division(10, 5));
		System.out.println(b.add(1,2));
		System.out.println(b.subtract(10, 5));		
	}
	
}
