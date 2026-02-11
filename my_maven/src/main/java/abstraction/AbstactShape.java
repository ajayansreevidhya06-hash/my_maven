package abstraction;



//Assignmnet

//abstract class - shape
//abstract method -draw()
//non abstract method- display
//normal class ..create normal method with same name as abstract method--content draw triangle
public abstract class AbstactShape 
{
	public abstract void draw();
	public void display()
	{
		
		System.out.println("Inside Abstarct class");
	}

}
