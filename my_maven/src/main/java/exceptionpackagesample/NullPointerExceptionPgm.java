package exceptionpackagesample;

public class NullPointerExceptionPgm {

	
	public void display()
	{
		String name="";
		String n="Sree";
		String s=null;
		System.out.println(name.length());
		System.out.println(s.length());//java.lang.NullPointerException:
		System.out.println(n.charAt(5));//java.lang.StringIndexOutOfBoundsException:
	}
	
	public static void main(String[] args) 
	
	{
		
		NullPointerExceptionPgm ob=new NullPointerExceptionPgm();
		//System.out.println(name.length());
		ob.display();
		
	}

}
