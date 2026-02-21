package multipleInheritanceInterface;

public class MultipleInheritanceChild implements InterfaceParent1,InterfaceParent2{

		
	public void show()
	{
		System.out.println("Method of child class");
		
	}
	
	public  void display()
	{
		System.out.println("Method of Parent1 Interface");
		
	}
	
	public  void print()
	{
		System.out.println("Method of Parent2 Interface");
		
	}
	public static void main(String[] args) {
		MultipleInheritanceChild ob=new MultipleInheritanceChild();
		ob.print();
		ob.display();
		ob.show();
	}

}
