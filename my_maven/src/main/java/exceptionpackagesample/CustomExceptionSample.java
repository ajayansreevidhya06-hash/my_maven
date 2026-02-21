package exceptionpackagesample;

public class CustomExceptionSample {
	
	
	public void test(int age) throws LicenceException
	{
		
		if(age<18)
		{
			
			throw new LicenceException("Not Eligible");
			
		}
		else 
		{
			System.out.println("Eligible");
		}
		
	}
	
	
	public static void main(String[] args) throws LicenceException {
		
		CustomExceptionSample ob =new CustomExceptionSample();
		ob.test(10);
	}

}
