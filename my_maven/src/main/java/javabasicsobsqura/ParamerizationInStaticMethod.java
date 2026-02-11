package javabasicsobsqura;

//paramerization in static method

class ParamerizationInStaticMethod

{

	public static void sub(int a,int b)
	{
		System.out.println(a-b);
	}

	public static void toPrint(String s,float f,double d,char c)

	{
		System.out.println(s);
		System.out.println(f);
		System.out.println(d);
		System.out.println(c);
	}

	public static void main(String args[])
	{
	
	ParamerizationInStaticMethod.sub(10,5);
	ParamerizationInStaticMethod.toPrint("Sree",23.4f,453.99,'s');
	
	
	}

}