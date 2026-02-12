package exceptionpackagesample;

public class NullPointerExceptionPgm {

	
	public void display()
	{
		String name="";
		String s=null;
		System.out.println(name.length());
		System.out.println(s.length());
		
	}
	
	public static void main(String[] args) 
	
	{
		
		NullPointerExceptionPgm ob=new NullPointerExceptionPgm();
		//System.out.println(name.length());
		ob.display();
	}

}
