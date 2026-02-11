package javabasicsobsqura;

class ObjectSample

{
	String s ="sree";  //non static/instance variable
	public void add()  //non static/instance method
	{
		int a=10;
		int b=20;
		System.out.println(a+b);
		
	}

	
	public static void main(String args[])
	{
	
	    ObjectSample obj = new ObjectSample();  //obj creation
	    obj.add();
	    System.out.println(obj.s);
	
	
	}

}