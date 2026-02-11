package polymorphismsample;

public class MethodOverrideChild extends MethodOverrideParent{

	//@override
	public void display()
	{
		
		System.out.println("Inside Chlid Class");	
		System.out.println("Chlid Class display method is overriding Parent class display method");
		super.display();//if we need to access Parent class method -OPTION 1
		
	
	}
	public static void main(String[] args) 
	
	{
		MethodOverrideChild ob=new MethodOverrideChild();
		ob.display();
		///if we need to access Parent class method -OPTION 2
		MethodOverrideParent ob1=new MethodOverrideParent();
		ob1.display();
		
		

	}

}
