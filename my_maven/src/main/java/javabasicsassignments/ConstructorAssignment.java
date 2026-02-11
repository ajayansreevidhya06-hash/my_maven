package javabasicsassignments;

class ConstructorAssignment
	{
		
		
		public ConstructorAssignment()
		{
			 String studentName="sreevidhya";
			 System.out.println("Inside default constuctor");
			 System.out.println(studentName);
			 	
		}
		public ConstructorAssignment(int empSalary,String empName)
		{
			 System.out.println("Inside parameterized constuctor");
			 System.out.println("Salary of Employee =" +empSalary);
			 System.out.println("Name of Employee =" +empName);
	
		}
		public void toPrint()
		{
			String s="JAVA";
			char b ='J';
			System.out.println("Inside Instance method ");
			System.out.println(s);
			System.out.println(b);
		}
		public void toPrint(String placeName1,String placeName2)
		{
		    System.out.println("Inside parameterized Instance method ");
			System.out.println(placeName1);
		    System.out.println(placeName2);
		}
		
		
		public static void main(String args[])
		{
	
			ConstructorAssignment obj1  = new ConstructorAssignment();       //default constuctor called
			ConstructorAssignment obj2  = new ConstructorAssignment(1234,"JOE");  //parameterized constuctor called
	    	obj1.toPrint();
			obj1.toPrint("TVM","EKM");
		}
	}