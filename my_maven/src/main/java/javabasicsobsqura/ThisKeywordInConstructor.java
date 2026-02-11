package javabasicsobsqura;

//multiple constuctors in a class and we can call only one constuctor from main().In this situation we use this keyword with constuctor

class ThisKeywordInConstructor
	{


		public ThisKeywordInConstructor(String name)
		{
			System.out.println(name);
			
		}

		public ThisKeywordInConstructor()

		{
		
			this("sree");
			System.out.println("inside default Constructor");
			
			
		}
		
		 public  ThisKeywordInConstructor(char c)

		{ 
		    this();
			System.out.println("calling last");
			System.out.println(c);
			
		}
		public static void main(String args[])
		{
	
			ThisKeywordInConstructor obj  = new ThisKeywordInConstructor('R');       
			
	    		
		}
}