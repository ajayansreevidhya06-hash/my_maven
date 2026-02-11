package abstraction;

public class AbsSample extends AbstractClass{

	public static void main(String[] args) 
	{
		AbsSample ob =new AbsSample();
		ob.display();
		//ob.print();

	}

	@Override
	public void print() 
	{
		System.out.println("to Pass Defn to Abstarct method");
		
	}

}
