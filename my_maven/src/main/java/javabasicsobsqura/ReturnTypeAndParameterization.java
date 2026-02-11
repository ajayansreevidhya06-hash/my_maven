package javabasicsobsqura;

class ReturnTypeAndParameterization

{

	public static int sub(int a,int b)
	{
		int c=a-b;
		return c;
	}

	public static char toPrint(String s , char d)

	{
		System.out.println("Printing " + s);
		return d;
		
	}

	public static void main(String args[])
	{
	
	 System.out.println(ReturnTypeAndParameterization.sub(10,5));  //to see the returned value of c
	 System.out.println(ReturnTypeAndParameterization.toPrint("sree",'A')); //to see the returned value of d
	
	
	}

}