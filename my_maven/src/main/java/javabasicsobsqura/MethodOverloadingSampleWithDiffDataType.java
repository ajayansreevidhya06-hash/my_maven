package javabasicsobsqura;


//method overloading-->multiple methods in same class,all methods in same name and diff datatype for parameters.


class MethodOverloadingSampleWithDiffDataType

{

	public static void toPrint(int a,char b)
	{
		System.out.println(a);
		System.out.println(b);
	}

	public static void toPrint(float f)

	{
		System.out.println("Printing float" +f);
		
		
	}
	public static void toPrint(double i,String j,int k)

	{
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		
	}
	public static int toPrint(int n,int m,int o,int p)

	{
		int z=n+m+o-p;
		//System.out.println(z);
		return z;
		
	}

	public static void main(String args[])
	{
	
	   MethodOverloadingSampleWithDiffDataType.toPrint(35.5f); 
	   MethodOverloadingSampleWithDiffDataType.toPrint(3,'t');
	   MethodOverloadingSampleWithDiffDataType.toPrint(1.21d,"sree",3);
	   MethodOverloadingSampleWithDiffDataType.toPrint(5,10,15,20);
	   System.out.println(MethodOverloadingSampleWithDiffDataType.toPrint(5,10,15,20));
	
	
	}

}