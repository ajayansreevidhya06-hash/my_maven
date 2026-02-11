package inheritance;

public class SingleInheritanceChild extends SingleInheritanceParent
{
	String a="hi";
	public void print() {
		
		
		System.out.println("Inside child class");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleInheritanceChild ob = new SingleInheritanceChild();
		ob.print();
		System.out.println(ob.a);
		ob.add();
		SingleInheritanceParent ob1=new SingleInheritanceParent();
		ob1.add();
		//ob1.print();//cannot be used in parent class
		System.out.println(ob.a);
		

	}

}
