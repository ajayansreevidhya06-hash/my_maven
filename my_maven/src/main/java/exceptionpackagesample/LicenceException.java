package exceptionpackagesample;

public class LicenceException extends Exception

{

	public LicenceException(String message) 
	{
		super(message);//exception parent calss ref---in this var 'message' =Not eligible
	}

}
