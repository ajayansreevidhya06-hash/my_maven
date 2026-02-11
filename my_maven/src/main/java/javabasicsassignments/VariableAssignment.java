package javabasicsassignments;

class VariableAssignment
{
     static String veg1 = "carrot";  //static var
	 static String veg2 = "Onion"; //static var
	 
	 String flower1 = "Rose"; //instance variable
	 String flower2 = "Lilly";//instance variable  //non-static variable cannot be referenced from a static context
	 
	 	
	public static void main(String args[])
	{
	 String orange = "Orange"; //local var
	 String apple = "Apple"; //local var
	 
	 System.out.println(orange);
	 System.out.println(apple);
	 
	 System.out.println(veg1);
	 System.out.println(veg2);
	 
	
	 }
}

