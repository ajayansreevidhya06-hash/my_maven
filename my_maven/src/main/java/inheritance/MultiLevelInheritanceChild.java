package inheritance;

public class MultiLevelInheritanceChild extends MultiILevelnheritanceParent{

	String c="ChildClass";
	public void print() {
		
		
		System.out.println("Inside child class");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiLevelInheritanceChild ob = new MultiLevelInheritanceChild();
		ob.print();
		System.out.println(ob.c);
		System.out.println("Inside Parent1");
		ob.add();
		System.out.println(ob.b);
		System.out.println("Inside Parent2");
		ob.sub();
		System.out.println(ob.a);
		
		

	}


}
