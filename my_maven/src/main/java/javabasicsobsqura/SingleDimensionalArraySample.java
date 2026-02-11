package javabasicsobsqura;

class SingleDimensionalArraySample
{
 public static void main(String args[])
 {
	int arr[]= {2,4,5,8,9};
	System.out.println(arr[0]);
	//System.out.println(arr[5]);
	 
	int arr1[]=new int[5];//Array instantiation
	 arr1[0]=4;
	 arr1[1]=3;
	 arr1[2]=2;
	 arr1[3]=1;
	 arr1[4]=0;
	 
	 for(int i=0;i<=4;i++)
	 {
		 System.out.println(arr1[i]);
		 
	 }
	 //System.out.println(arr[0]);
	 String strArr[]={"aa","bb","cc"};
	 System.out.println(strArr.length);
 }
}
//single dim with char as above