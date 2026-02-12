package exceptionpackagesample;

public class ClassExceptionSample {

	public void display()
	{
		int a=10;
		int b=a/0;
		System.out.println(b);
	}
	
	public static void main(String[] args) 
	
	{
		ClassExceptionSample ob=new ClassExceptionSample();
		ob.display();

	}

}
