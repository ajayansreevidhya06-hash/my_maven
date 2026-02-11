package javabasicsobsqura;

class ThisKeywordInVariable
	{


		String name;
		int age;
		public  ThisKeywordInVariable(String name,int age)
		{
			this.name=name;
			this.age=age;

		}

		public void display()

		{
			System.out.println(name);
			System.out.println(age);
		}

		public static void main(String args[])
		{
	
			ThisKeywordInVariable obj  = new ThisKeywordInVariable("sree",10);       
			obj.display();
	    		
		}
}