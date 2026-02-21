package exceptionpackagesample;

public class ThrowKeywordAssignment {

public static void display()
	
	{
		int n=20;
		if(n<0)
		{
			throw new ArithmeticException("Not a valid number");
		}
		else 
		{
			System.out.println("Valid number");
		}
	}
	
	
	
	public static void main(String[] args) {
		
		ThrowKeywordAssignment.display();
	}

}
//initialize a number
//check that its valid or not
//use throw keyword
//int a=23;
//if(num<0)