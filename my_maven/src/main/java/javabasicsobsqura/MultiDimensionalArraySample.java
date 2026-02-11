package javabasicsobsqura;

class MultiDimensionalArraySample
{
 public static void main(String args[])
 {
	int arr[][]= {{2,4,5},{8,9,7},{4,5,6}};  //initialize
	System.out.println(arr[0][0]);
	System.out.println(arr[2][2]);
	//System.out.println(arr[5]);
	 
	int arr1[][]=new int[3][3];//Array instantiation
	 arr1[0][0]=4;
	 arr1[0][1]=6;
	 arr1[0][2]=5;
	 arr1[1][0]=8;
	 arr1[1][1]=1;
	 arr1[1][2]=2;
	 arr1[2][0]=4;
	 arr1[2][1]=0;
	 arr1[2][2]=3;
	 System.out.println("*****************");
	 System.out.println(arr1[0][0]);
	 System.out.println(arr1[0][2]);
	 System.out.println(arr1[2][2]);
	 System.out.println("******************");
	 //String strArr[][]={{"aa","bb","cc"},{"aa","bb","cc"}};
	 //System.out.println(strArr.length);
	 
	 
	 int arr2[][]= {{1,2,3},{4,5,6},{7,8,9}}; 
	 for(int i=0;i<=2;i++)//row index -3 rows of 3x3 matrix
	 {
		 for(int j=0;j<=2;j++)//column index -3 columns
		 {
			 System.out.println(arr2[i][j]);
			 
		 }
	 
	 }
	 
	 }
}

//iteration1:i=0,0<=2-true,j loop starts,j=0,0<=2-true,print [0][0]=1,j++ =>j=1
//	                                     j=1,1<=2,true,print[0][1] =2,j++ ->j=2
//										 j=2,2<=2,true,print[0][2] =3,j++ ->j=3
//										 j=3,3<=2,False,exit j loop 
//										 i++= i=1
//iteration2:i=1,1<=2-true,j loop starts,j=0,0<=2-true,print [1][0]=1,j++ =>j=4
//                                         j=1,1<=2,true,print[2][1] =2,j++ ->j=5
//                                         j=2,2<=2,true,print[2][2] =3,j++ ->j=6
//                                         j=3,3<=2,False,exit j loop 
//                                         i++= i=1