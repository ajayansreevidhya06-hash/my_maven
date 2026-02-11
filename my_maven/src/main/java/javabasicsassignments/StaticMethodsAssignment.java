package javabasicsassignments;

class StaticMethodsAssignment

{
	static int empId=500052;
	static String empDesignation="Software Test Analyst";
	static String flowerName1="Rose";
	static String flowerName2="Lilly";

public static void main(String args[])
 {

		 StaticMethodsAssignment.student();
		 employee();		 
	 	 System.out.println("Flower1 =" + "" +StaticMethodsAssignment.flowerName1);
		 System.out.println("Flower2 =" + "" +StaticMethodsAssignment.flowerName2);
		 StaticMethodsAssignment.printFloatAndDouble();
		 StaticMethodsAssignment.flowerNames();
 }

 public static void student()
	{
		String studentName = "Sree";
		int age=15;
		System.out.println("studentName = " +" " +studentName);
		System.out.println("studentAge = " +" " +age);
	}
	
	
 public static void employee()
 {
	 System.out.println("EmployeeID = " +" " +empId);
	 System.out.println("EmployeeDesignation	 = " +" " +empDesignation);
	
 }
 
 public static void flowerNames()
 {
	 System.out.println("From flower method");
	 System.out.println(flowerName1);
	 System.out.println(flowerName2);
	
	
 }

 public static void printFloatAndDouble()
 {
	    double a = 125035;
		float f = 5.0f;
		System.out.println("DoubleValue = " +" " +a);
		System.out.println("FloatValue = " +" " +f);
	
 }
 

}
