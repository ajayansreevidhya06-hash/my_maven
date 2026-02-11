package interfacepackage;

public class SampleClass implements InterfaceSample{

	public void print()
	
	{
		System.out.println("Method of class");
	}
	
	public void add()
	{
		System.out.println(a+b);
	}
	public void display() 
	{
		System.out.println("Method of interface");
	}
	
	
	public static void main(String[] args) 
	{

		SampleClass ob=new SampleClass();
		ob.print();
		ob.add();
		ob.display();
		System.out.println(a);
		System.out.println(b);
		
		//InterfaceSample ob1=new InterfaceSample();
		InterfaceSample ob1=new SampleClass();//Cannot instantiate the type InterfaceSample
		//ob1.print();
		ob1.add();
		ob1.display();
		System.out.println(ob1.a);
	}

}
