package javabasicsobsqura;

class ConstructorSample
	{
		
		
		public ConstructorSample()
		{
			 String s="sree";
			 int a =100;
			 System.out.println("Inside default constuctor");
			 System.out.println(s);
			 System.out.println(100);
	
		}
		public ConstructorSample(int i,int j)
		{
			 System.out.println(i+j);
	
		}
		
		
		
		public static void main(String args[])
		{
	
			ConstructorSample obj  = new ConstructorSample();       //default constuctor called
			ConstructorSample obj2 = new ConstructorSample(10,20);  //parameterized constuctor called
	    		
		}
	}