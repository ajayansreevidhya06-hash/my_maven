package polymorphismsample;

public class MethodOverrideStudentChild extends MethodOverrideStudentParent
{
	
	public void display(String name)
	{
		
		System.out.println("Inside Student's Child Class");	
		System.out.println("StudentName :" +name);	
	}

	public static void main(String[] args)
	
	{
		MethodOverrideStudentChild ob=new MethodOverrideStudentChild();
		ob.display("Sreevidhya");
	}

}
