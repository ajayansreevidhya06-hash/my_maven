package javabasicsobsqura;

public class ArraySample2 {

	public static void main(String[] args) 
	{
		
			int arr[]= {1,2,3,4};
			System.out.println("0th index value = " +arr[0]);
			//System.out.println(arr[5]);//java.lang.ArrayIndexOutOfBoundsException
			 
			int arr1[]=new int[5];//Array instantiation
			 arr1[0]=8;
			 arr1[1]=7;
			 arr1[2]=6;
			 arr1[3]=5;
			 arr1[4]=4;
			 
			 for(int i=0;i<=4;i++)
			 {
				
				 System.out.println(arr1[i]);
				 
			 }
			 //System.out.println(arr[0]);
			 
			 String strArr[]={"aa","bb","cc"};
			 System.out.println("StringArray length =" +strArr.length);
		 }
	}


