package exceptionpackagesample;

public class ThrowKeywordSample {

	public static void display(int age)
	
	{
		
		if(age<18)
		{
			throw new ArithmeticException("Not eligible");
		}
		else 
		{
			System.out.println(" Eligible");
		}
	}
	
	
	
	public static void main(String[] args) {
		
		ThrowKeywordSample.display(20);
	}

}
