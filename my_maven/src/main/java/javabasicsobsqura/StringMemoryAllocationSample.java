package javabasicsobsqura;

class StringMemoryAllocationSample

{
	public static void main(String args[])
		{
	
			String name="sree";
			System.out.println(name);
			
			String StrObj  = new String("SS");  
			System.out.println(StrObj);
			
			//String methods
			//--------------
			
			
			//String length() 
			String s2="Java";
			System.out.println(s2.length()); //output=4
			
			
			//String charAt() 
			String s3="Vidhya";
			System.out.println(s2.charAt(0)); //output=V
			
			
			//String valueOf() 
			int a=20;
			String s4=String.valueOf(a);
			System.out.println(s4); //output=10
			
			String s5=String.valueOf(4.5f);
			System.out.println(s5); //output=4.5
			
			//equals
			
			String s6="HELLO";
			String s7="HELLO";
			String s8="hello";
			String s9="ZZ";
			System.out.println(s6.equals(s7)); //true
			System.out.println(s7.equals(s8));//false
			System.out.println(s8.equals(s9));//false
			
			//isEmpty()
			String s10="";
			String s11="aa";
			System.out.println(s10.isEmpty());
			System.out.println(s11.isEmpty());
			
			//equalsIgnoreCase
			String s12="HELLO";
			String s13="HELLO";
			String s14="hello";
			System.out.println(s12.equalsIgnoreCase(s13));
			System.out.println(s13.equalsIgnoreCase(s14));
			
			
			
			
		}

}