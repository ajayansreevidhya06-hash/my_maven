package javabasicsobsqura;

class SwitchCaseForDays
{
     	 	
	public static void main(String args[])
	{
	 String weekday="Monday";
	 
	switch(weekday)
	{
	 case "Saturday":
	 System.out.println("Today is not Monday");
	 break; 
	 case "Sunday":
	 System.out.println("Today is not Monday");
	 break;
	 case "Tuesday":
	 System.out.println("Today is not Monday");
	 break;
	 case "Wednesday":
	 System.out.println("Today is not Monday");
	 break; 
	 case "Thursday":
	 System.out.println("Today is not Monday");
	 break;
	 case "Monday":
	 System.out.println("Today is Monday");
	 //break; //will print below statement as well as break is commented
	 
	 default:
	 System.out.println("Invalid");
		 
	
	 }
}
}


