package javabasicsobsqura;

class ForLoopForOddNumbers
{
     	
	public static void main(String args[])
	{
	 for(int a=0;a<=10;a++)
	 {
	 
		  if(a%2!=0)  //remainder is != 0
	       {
	        System.out.println(a);
	       }
	 
	 }
}

}

// a=1 , 1<=10 true ->for loop->check if condition 1/2 rem!=0 -odd num, print 1 -> a ++ =2
// a=2 , 2<=10 true ->for loop->check if condition 2/2 rem=0 - even num, skip if block -> a ++ =3
// a=3 , 3<=10 true ->for loop->check if condition 3/2 rem!=0 - odd num, print 3 -> a ++ =4