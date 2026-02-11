package accessmodifiers1;

import accessmodifiers.AccessModClass1;

public class AccessModClass4 {

	public static void main(String[] args) 
	
	{
		//AccessSample4 ob4 =new AccessSample4();
		AccessModClass1 ob5=new AccessModClass1();
		System.out.println(ob5.a);
		//System.out.println(ob5.b);//cannot accessible outside class
		//System.out.println(ob5.c);
		//System.out.println(ob5.f);

	}

}
