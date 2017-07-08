package com.trying;

public final class StaticBlock {
public static String vvlsh()
{
	String s="Nice Family";
	System.exit(0);

	return s;
	
}
public static void main(String[] args) {
    System.out.println("main(String[] args)");
}

public static void main(String arg1) {
    System.out.println("main(String arg1)");
}

public static void main(String arg1, String arg2) {
    System.out.println("main(String arg1, String arg2)");
}
}
