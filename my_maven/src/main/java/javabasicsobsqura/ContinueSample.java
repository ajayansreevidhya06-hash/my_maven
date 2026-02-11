package javabasicsobsqura;

class ContinueSample
{
     	
	public static void main(String args[])
	{
	 for(int a=0;a<=5;a++)
	 {
		if(a==3)
	     {
	      continue;
	     }
	    System.out.println(a);
	 }
	  
	 }
}

//iteration 1 :a=1 ,1<=5 -true ->for loop =>check if 1==3 false -print 1
//a=2,2<=5 -true ->for loop =>check if 2==3 false -print 2
//a=3 ,3<=5 -true ->for loop =>check if 3==3 true - continue=Skip iteration(will not print)
//a=4 ,4<=5 -true ->for loop =>check if 4==3 false - print 4
