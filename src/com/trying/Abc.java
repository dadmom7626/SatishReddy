package com.trying;

import java.util.Stack;

public class Abc {

	public static void main(String[] args) {
StringBuilder sb = new StringBuilder("10011101000");
String s=sb.toString();
int l=s.length();
Stack<Character> st = new Stack<Character>();
for(int i=0;i<l;i++){
	for(int j=1;j<l;j++){
	if(s.charAt(i)!=s.charAt(j))
	{
	st.push(s.charAt(i));	
	break;
	}
	else if(s.charAt(i)==s.charAt(j))
	{
		continue;
	}
	else
	{
				i=j;
		j=i+1;
	}
	}
	}

}

}
