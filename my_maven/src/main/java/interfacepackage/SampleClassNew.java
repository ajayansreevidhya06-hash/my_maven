package interfacepackage;

public class SampleClassNew implements InterfaceSampleNew
 {

	public void shape()
	{
		System.out.println("Inside class method Shape");
		
	}
	public void area()
	{
	 System.out.println(length*breadth);
	}
	
	public void draw()
	{
	 System.out.println("Shape is Round");
	}
	
	public static void main(String[] args)
	{

	
		SampleClassNew ob = new SampleClassNew();
		ob.draw();
		ob.shape();
		ob.area();
		InterfaceSampleNew ob1 =new SampleClassNew();
		System.out.println("Using Interface object");
		ob1.area();
		ob1.draw();
	}

}
