package exceptionpackagesample;

//Question: class bankaccount
//method- payment()
//salary should pass as parameter
//USER EXCEPtion class- SalaryException


public class BankAccount {

	public void payment(int salary) throws SalaryException 
	{
		
		if(salary<10000)
		{
			
			throw new SalaryException("Customer is not Eligible for the Account creation");
			
		}
		else 
		{
			System.out.println("Eligible for Account creation");
		}
		
	}
	
	
	public static void main(String[] args) throws SalaryException  
	{
		
		BankAccount ob =new BankAccount();
		ob.payment(1000);
	}

}
