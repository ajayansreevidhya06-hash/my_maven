package encapsulation;

public class EncapsulationAssignment {

	private int studentRollNumber;
	private String studentName;
	private int studentMarks;
	
	public void setter(String studentName,int studentMarks,int studentRollNumber)
	{
		
		this.studentName=studentName;
		this.studentMarks=studentMarks;
		this.studentRollNumber=studentRollNumber;
	}
	
	public void getter()
	{
		System.out.println("Student Details");
		System.out.println("Student RollNumber -"+studentRollNumber);
		System.out.println("studentName -" +studentName);
		int bonusMarks=100;
		studentMarks=studentMarks+bonusMarks;
		System.out.println("studentMarks -" +studentMarks);
	}
	
	
}
