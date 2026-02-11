package javabasicsobsqura;

class VariableSample
{
     static char c = 's';  //static var
	 char t ='t';
	
	public static void main(String args[])
	{
	 int a = 10; //local var
	 System.out.println(a);
	 System.out.println(c);
	 //System.out.println(t);//non-static variable t cannot be referenced from a static context
	
	
	}
}


//C:\Users\manoj\Documents\Sree_Java>javac VariableSample.java
//VariableSample.java:10: error: non-static variable t cannot be referenced from a static context
 //        System.out.println(t);