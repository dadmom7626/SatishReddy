package com.trying;

public class Amazon {

	public static void main(String[] args) {
String s = "10110001011";
String st=s.replaceAll("1", "A");
System.out.println(st);
String st1=s.replaceAll("[0-0]", "A");
System.out.println(st1);
String st2=new StringBuffer(s).reverse().toString();
System.out.println(st2);



String s1 = "9A2Ocw7Ac26Wqa";
String str=s1.replaceAll("[a-zA-Z]","");
System.out.println(str);
s1=s1.replaceAll("[a-z0-9]","");
System.out.println(s1);
System.out.println(s1.charAt(3));


	}

}
