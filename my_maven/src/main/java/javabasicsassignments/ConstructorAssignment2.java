package javabasicsassignments;

//initialise an instance variable(employee name and salary) by using a constructor. need details of 3 employees

class ConstructorAssignment2
	{
		
		 String EmployeeName;
		 int EmployeeSalary;
		public ConstructorAssignment2(String s,int a)
		{
			
			 EmployeeName=s;    //instance var=local var   //initialise an instance variable
			 EmployeeSalary=a;  //instance var=local var    //initialise an instance variable
	
		}
		public void print()
		{
		    System.out.println(EmployeeName);
			System.out.println(EmployeeSalary);
	
		}
		
		
		
		public static void main(String args[])
		{
	
			ConstructorAssignment2 obj  = new ConstructorAssignment2("CCC",10003);       
			obj.print();
			ConstructorAssignment2 obj1  = new ConstructorAssignment2("AAA",10000);
			obj1.print();
			ConstructorAssignment2 obj2  = new ConstructorAssignment2("BBB",10001);
			obj2.print();
	    		
		}
	}