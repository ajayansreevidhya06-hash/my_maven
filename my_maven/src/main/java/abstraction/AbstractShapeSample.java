package abstraction;

public class AbstractShapeSample extends AbstactShape
{
	
	public void draw()
	{
		
		System.out.println("Inside Sample class");
		System.out.println("draw triangle");
	}

	public static void main(String[] args) {
		AbstractShapeSample ob=new AbstractShapeSample();
		ob.display();
		ob.draw();
		
	}

}
