package inheritance;

public class SuperCar extends SuperVehicle
{
	
	public void display() 
	
	{
		System.out.println(super.speed);
		super.print();
		
		
	}
	
	public SuperCar()
	{
		super();
		System.out.println("ChildClass Constructor");
		
	}
	public static void main(String[] args) 
	{
		SuperCar ob=new SuperCar();
		ob.display();


	}

}
