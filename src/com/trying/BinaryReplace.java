package com.trying;
import java.security.Provider;
import java.util.LinkedList;
import java.util.function.Consumer;

import javax.crypto.SecretKeyFactory;
import javax.crypto.SecretKeyFactorySpi;

public class BinaryReplace   {
	public static void main(String[] args)   {
	StringBuilder sb= new StringBuilder("111011011100");
	int count =0;
	int n=1;
	StringBuilder s= new StringBuilder();
	for(int i=0;i<=(sb.length()-1);i++){
	if(sb.charAt(i)==sb.charAt(i+n)&&(i+n)<=(sb.length()-1))
	{
		count++;
		n++;
		continue;		
	}
	else if(count>=1)
	{

	s.append("A");
	count=0;
	n=i+1;
	}
	else if(count==0)
	{
		s.append(sb.charAt(i));
		break;
	}
	}
	
	System.out.println(s);
	}
	
	}