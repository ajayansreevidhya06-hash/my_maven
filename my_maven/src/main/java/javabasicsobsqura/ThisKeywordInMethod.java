package javabasicsobsqura;

////multiple method in a class and we can call only one constuctor from main().In this situation we use this keyword with method

class ThisKeywordInMethod
	{


		String name;
		int age;
		public  ThisKeywordInMethod(String name,int age)
		{
			this.name=name;
			this.age=age;
			System.out.println("inside constructor - before this.method");
			this.display();
			this.add();


		}

		public void display()

		{
			System.out.println(name);
			System.out.println(age);
		}
		
		 public void add()

		{
			int q=10;
			int p=11;
			System.out.println(q+p);
			
		}
		public static void main(String args[])
		{
	
			ThisKeywordInMethod obj  = new ThisKeywordInMethod("sree",10);       
			System.out.println("inside main() - obj.method");
			obj.display();
	    		
		}
}