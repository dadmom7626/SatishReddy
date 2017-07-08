package com.trying;

import java.util.Stack;

public class StringReplace {

	public static void main(String[] args) {
StringBuilder sb = new StringBuilder("1100");
final int LENGTH = sb.length();
Stack s = new Stack(); 
for(int i=0;i<LENGTH;i++){
	for(int j=i+1;j<LENGTH;j++){
		while (i<LENGTH&&j<LENGTH){
		if(sb.charAt(i)==sb.charAt(j)){
continue;          		
	}
		else {
			s.push(sb.charAt(i));
			i=j;
			System.out.println(s.get(i));
		}
		}
	}
	
}

	}

}
