package com.org.satish.multithreading;

public class RunSleep extends Thread {
	public void run(){  
		  for(int i=1;i<5;i++){  
		    try{
		    	Thread.sleep(500);
		    	}
		    catch(InterruptedException e)
		    {
		    System.out.println(e);
		    }  
		    System.out.println(i);  
		  }  
		 }  
	public static void main(String[] args) {
		RunSleep t1=new RunSleep();  
		RunSleep t2=new RunSleep();  
		   
		  t1.start();  
		  t2.start();  
		 }  
	}


