package javabasicsassignments;

public class InheritanceManager extends InheritanceEmployee{

	String d="department IT";
	
	public void displayDept() 
	{
			
		System.out.println("Department : " +d);
			

	}
	
	public static void main(String[] args) 
	
	{
		InheritanceManager ob =new InheritanceManager();
		ob.displayEmployee();
		ob.displayPerson();
		ob.displayDept();

		
		
	}

}
