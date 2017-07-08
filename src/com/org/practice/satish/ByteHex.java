package com.org.practice.satish;

import java.util.Random;

public class ByteHex {

	public static void main(String[] args) {
byte b=0b1001;
int hex1=0xDAF;
System.out.println(b);
System.out.println(hex1);

//Decimal to Hexa Decimal
String str = Integer.toHexString(3503);
System.out.println("Method 1: Decimal to hexadecimal: "+str);

//Decimal to Binary
System.out.println(Integer.toBinaryString(9));
	}

}
