package javabasicsobsqura;

class ReturnTypeSample

{

	public static int add()
	{
		int a=10;
		int b=20;
		int c=20;
		return c;
	}

	public static String toPrint()

	{
		String s ="Sree";
		float f  =11.1f;
		System.out.println(f);
		return s;
		
	}

	public static void main(String args[])
	{
	
	 System.out.println(ReturnTypeSample.add());
	 System.out.println(ReturnTypeSample.toPrint());
	
	
	}

}