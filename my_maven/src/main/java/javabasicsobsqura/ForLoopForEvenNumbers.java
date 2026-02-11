package javabasicsobsqura;

class ForLoopForEvenNumbers
{
     	
	public static void main(String args[])
	{
	 for(int a=0;a<=10;a++)
	 {
	 // int b=2;
	  //if(a%b==0)
		  if(a%2==0)  //if(1/2==0)
	       {
	        System.out.println(a);
	       }
	 
	 }
}

}

// i=1 , 1<=10 true ->for loop->check if condition 1/2 rem!=0 -not even num, if block skip ->i ++ =2
// i=2 , 2<=10 true ->for loop->check if condition 2/2 rem=0 - even num, if block execute  as condition true ->print 2 , i ++ =3