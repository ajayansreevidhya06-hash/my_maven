package accessmodifiers;

public class AccessModClass2 {

	public static void main(String[] args) 
	
	
	{
		AccessModClass1 ob1=new AccessModClass1();
		System.out.println(ob1.a);//Public var
		//System.out.println(ob1.b);//Private Var -cannot accessible outside class
		System.out.println(ob1.c);//Protected var
		System.out.println(ob1.f);//Default var

	}

}
