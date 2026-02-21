package reviewobsqura;

public class ThisKeyWordForMethod {

	public void display()
	
	{
		
		System.out.println("Inside Method 1");
		this.sum(5, 10);
	}
	
  public void sum(int a, int b)
	
	{
		//a=5;
		//b=10;
	    int c=a+b;
	    System.out.println("Inside Method Sum =" + c);
	}
	public static void main(String[] args) 
	
	{
		
		ThisKeyWordForMethod ob =new ThisKeyWordForMethod();
		ob.display();
		
	}

}
