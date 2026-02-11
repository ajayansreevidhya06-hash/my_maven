package javabasicsobsqura;

class ConstructorSample2
	{
		
		 String name;
		 int age;
		public ConstructorSample2(String s,int a)
		{
			
			 name=s; //instance var=local var
			 age=a; //instance var=local var
	
		}
		public void print()
		{
		    System.out.println(name);
			 System.out.println(age);
	
		}
		
		
		
		public static void main(String args[])
		{
	
			ConstructorSample2 obj  = new ConstructorSample2("sree",10);       
			obj.print();
	    		
		}
	}