package stringClasses;

public class StringBufferSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer ob=new StringBuffer("sree");
		System.out.println(ob);
		
		
		//append() - string concatenation

		ob.append("vidhya"); //sree+vidhya
		System.out.println(ob);
		
		//insert
		ob.insert(4, "Ajayan");
		System.out.println(ob); //sreeAjayanvidhya
		
		
		//replace
		ob.replace(4, 10, " ");
		System.out.println(ob); //sree vidhya
		
		
		//delete
		ob.delete(4, 11);
		System.out.println(ob); //sree
		
		//reverse
		ob.reverse();
		System.out.println(ob);////eers
	}

}
