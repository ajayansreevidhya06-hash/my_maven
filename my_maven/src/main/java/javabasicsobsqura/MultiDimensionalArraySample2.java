package javabasicsobsqura;

class MultiDimensionalArraySample2
{
 public static void main(String args[])
 {
	 
	 int arr[][]= {{1,2,8},{4,9,6},{3,8,7}}; 
	 for(int i=0;i<=2;i++)//row index -3 rows of 3x3 matrix
	 {
		 for(int j=0;j<=2;j++)//column index -3 columns
		 {
			 System.out.print(arr[i][j]+" ");
			 
		 }
	 
	        System.out.println();
	 }
	 
	 }
}

//iteration1:i=0,0<=2-true,j loop starts,j=0,0<=2-true,print [0][0]= 1,j++ ->j=1
//	                                     j=1,1<=2,true,print [0][1] =2,j++ ->j=2
//										 j=2,2<=2,true,print [0][2] =3,j++ ->j=3
//										 j=3,3<=2,False,exit j loop 
//										 i++ -> i=1
//iteration2:i=1,1<=2-true,j loop starts,j=0,0<=2-true,print [1][0]=1,j++ =>j=1
//                                       j=1,1<=2,true,print[1][1] =2,j++ ->j=2
//                                       j=2,2<=2,true,print[1][2] =3,j++ ->j=3
//                                       j=3,3<=2,False,exit j loop 
//                                       i++= i=2

//iteration3:i=2,2<=2-true,j loop starts,j=0,0<=2-true,print [2][0]=1,j++ =>j=1
//                                       j=1,1<=2,true,print[2][1] =2,j++ ->j=2
//                                       j=2,2<=2,true,print[2][2] =3,j++ ->j=3
//                                       j=3,3<=2,False,exit j loop 
//                                       i++= i=3
//iteration4:i=3,3<=2-false-Exit i loop