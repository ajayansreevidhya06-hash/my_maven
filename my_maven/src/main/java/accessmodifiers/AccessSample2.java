package accessmodifiers;

public class AccessSample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessSample1 ob1=new AccessSample1();
		System.out.println(ob1.a);
		//System.out.println(ob1.b);//cannot accessible outside class
		System.out.println(ob1.c);
		System.out.println(ob1.f);
		
	}

}
