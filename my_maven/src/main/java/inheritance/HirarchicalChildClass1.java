package inheritance;

public class HirarchicalChildClass1 extends HirarchicalParentClass{

	
	public void multiplication()
	{
		
		int a =10;
		int b=20;
		System.out.println("Child Class1 method");
		System.out.println("MultiplicationResult = " +a*b);
	}
	
	public static void main(String[] args) 
	
	{
		HirarchicalChildClass1 childObj=new HirarchicalChildClass1();
		childObj.multiplication();
		childObj.add();

	}

}
