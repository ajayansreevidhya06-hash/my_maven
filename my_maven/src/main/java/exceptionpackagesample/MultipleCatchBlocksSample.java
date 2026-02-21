package exceptionpackagesample;

public class MultipleCatchBlocksSample {
	
	
	public void display()
	{
		int a=10;
		
		try 
		{
			int b=a/0;
			System.out.println(b);
			String name=null;
			System.out.println(name.length());
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic exception handled");
			System.out.println(e);
		}
			
		catch(Exception e1)
		{
			System.out.println("------------------------------");
			System.out.println("NullPointer Exception handled");
			System.out.println(e1);
		}
	}

	public static void main(String[] args) {
		MultipleCatchBlocksSample ob=new MultipleCatchBlocksSample();
	    ob.display();
	}

}
