package exceptionpackagesample;

public class TryCatchForArithmeticException {

	public void display()
	{
		int a=10;
		
		try 
		{
			int b=a/0;
			System.out.println(b);
		}
		catch(Exception e)
		{
			System.out.println("Exception handled");
			System.out.println(e);
		}
		finally {
			System.out.println("******************");
			System.out.println("finally block");
			System.out.println("******************");
		}
		
	}
	
		public static void main(String[] args) 
	
	{
			TryCatchForArithmeticException ob=new TryCatchForArithmeticException();
		    ob.display();

	}


}
