package com.org.satish;

import java.util.Scanner;

public class SymbolCheck {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
String s= sc.nextLine();
System.out.println(s.length());
for(int i=0;i<=(s.length()-1);i++){
		if(s.charAt(i)==s.charAt(i+1))
		{
			System.out.println("same");
			break;
		}
		else
			continue;
	
	//System.out.println(s.charAt(i));
	}
}

	}


