package encapsulation;

public class EncapsulationSampleClass 

{
	
	private int salary;
	private String name;
	
	public void setter(String name,int salary)
	{
		
		this.name=name;
		this.salary=salary;
	}
	
	public void getter()
	{
		System.out.println(name);
		int incentive=1000;
		salary=salary+incentive;
		System.out.println(salary);
	}
}
	
	

