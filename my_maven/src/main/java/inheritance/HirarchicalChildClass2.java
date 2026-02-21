package inheritance;

public class HirarchicalChildClass2 extends HirarchicalParentClass{

	public void sub()
	{
		
		int a =10;
		int b=20;
		System.out.println("Child Class2 method");
		System.out.println("Sub = " + (b-a));
	}
	
	public static void main(String[] args) 
	
	{
		HirarchicalChildClass2 childObj2=new HirarchicalChildClass2();
		childObj2.sub();
		childObj2.add();

	}

}
