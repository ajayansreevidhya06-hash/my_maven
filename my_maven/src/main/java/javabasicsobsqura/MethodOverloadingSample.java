package javabasicsobsqura;


//method overloading-->multiple methods in same class,all methods in same name and same datatype for parameters.


class MethodOverloadingSample

{

	public static void toPrint(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
	}

	public static void toPrint(int s)

	{
		System.out.println("Printing " + s);
		
		
	}
	public static void toPrint(int i,int j,int k)

	{
		
		System.out.println(i*j*k);
		
	}
	public static void toPrint(int n,int m,int o,int p)

	{
		int z=n+m+o-p;
		System.out.println(z);
		
	}

	public static void main(String args[])
	{
	
	 MethodOverloadingSample.toPrint(3); 
	 MethodOverloadingSample.toPrint(3,4);
	 MethodOverloadingSample.toPrint(1,2,3);
	 MethodOverloadingSample.toPrint(5,10,15,20);
	
	
	}

}