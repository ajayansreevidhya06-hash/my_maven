package exceptionpackagesample;

public class MultipleTryCatchBlocksSample {

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
			System.out.println("Arithmetic exception handled");
			System.out.println(e);
		}
		try 
		{
			String name=null;
			System.out.println(name.length());
			
		}
		
		catch(Exception e1)
		{
			System.out.println("------------------------------");
			System.out.println("NullPointer Exception handled");
			System.out.println(e1);
		}
		try 
		{
			
			String n="Sree";
			System.out.println(n.charAt(5));//java.lang.StringIndexOutOfBoundsException:
		}
		catch(Exception e2)
		{
			System.out.println("------------------------------");
			System.out.println("StringIndex Exception handled");
			System.out.println(e2);
			
		}
		try {
			
			int arr[]= {0,1,2,3};
			System.out.println(arr[4]);
			
		}
		catch(Exception e3)
		{
			System.out.println("------------------------------");
			System.out.println("Array Index Exception handled");
			System.out.println(e3);
		}
		finally {
			System.out.println("******************");
			System.out.println("finally block");
			System.out.println("******************");
		}
		
	}
	
		public static void main(String[] args) 
	
	{
			MultipleTryCatchBlocksSample ob=new MultipleTryCatchBlocksSample();
		    ob.display();

	}
}
