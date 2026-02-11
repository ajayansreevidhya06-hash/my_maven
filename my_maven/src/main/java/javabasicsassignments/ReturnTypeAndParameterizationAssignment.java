package javabasicsassignments;

class ReturnTypeAndParameterizationAssignment

{

	public static int multiplicationMethod(int a,int b)
	{
		int m=a * b;
		return m;
	}

	public static int divisionMethod(int c , int s)

	{
		int d=c / s;
		return d;
		
	}
	
	public static int toFindLargestNumber(int h , int k)

	{
		if (h>k)
	     {
	        return h;

         }		
		else
		 {
			return k;
         }

			
	}
	
	public static int areaOfSquare(int sideOfSquare)

	{
		//equation => Area of square = a*a
		int squareArea=sideOfSquare*sideOfSquare;
		return squareArea;
		
	}



	public static int areaOfCube(int sideOfCube)

	{
		///equation => Area of cube = 6*a*a
		int cubeArea=6*sideOfCube*sideOfCube;
		return cubeArea;
		
	}
	public static void main(String args[])
	{
	
	 //System.out.println("Multiplication = "+ReturnTypeAndParameterizationAssignment.multiplicationMethod(10,5));
	 //System.out.println("Division = "+ReturnTypeAndParameterizationAssignment.divisionMethod(20,5)); 
	 //System.out.println("LargestNum = "+ReturnTypeAndParameterizationAssignment.toFindLargestNumber(100,101));
	 //System.out.println("AreaOfSquare = "+ReturnTypeAndParameterizationAssignment.areaOfSquare(3)); 
	 //System.out.println("AreaOfCube = "+ReturnTypeAndParameterizationAssignment.areaOfCube(5));
	 System.out.println("AreaOfCube = "+areaOfCube(5));
	 System.out.println("Multiplication = "+multiplicationMethod(0,5));
	 System.out.println("Division = "+divisionMethod(20,5)); 
	 System.out.println("LargestNum = "+toFindLargestNumber(100,101));
	 System.out.println("AreaOfSquare = "+areaOfSquare(3)); 
	 	
	
	}

}