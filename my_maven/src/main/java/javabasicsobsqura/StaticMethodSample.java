package javabasicsobsqura;

class StaticMethodSample

{
	static int d=50;
	static int e=20;

 public static void add()
	{
		int a=10;
		int b=10;
		int c=a+b;
		System.out.println(c);
	}
	
	
 public static void sub()
 {
	 System.out.println(d-e);
	
 }

 public static void main(String args[])
 {

		StaticMethodSample.add();
		 sub();
		
 }

}
