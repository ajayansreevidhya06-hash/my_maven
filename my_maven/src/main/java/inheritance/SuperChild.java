package inheritance;

public class SuperChild extends SuperParent
{

	//String c ="Child";
	String p ="Child";
	public void displayChild() 
	{
	  System.out.println(super.p); //to call immediate parent class obj
	  System.out.println(p);
	  System.out.println("SuperChild Class");
	  super.displayParent();
	  
	
	}
	public SuperChild() {
		
		super();
		System.out.println("Chlid Class Constuctor");
		
	}
	
	public static void main(String[] args) 
	
	{
		SuperChild ob =new SuperChild();
		ob.displayChild();
		System.out.println(ob.p);//will get child class var value as both paretntchild var are same
		
	}

}
