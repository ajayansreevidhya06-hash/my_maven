package stringClasses;

public class StringBuilderSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		StringBuilder strbuilderOb= new StringBuilder("MyJavaProgram");
		strbuilderOb.append("Obsqura");
		System.out.println(strbuilderOb);
		
		//insert
		strbuilderOb.insert(2, " ");
		System.out.println(strbuilderOb);
		
		//delete
		strbuilderOb.delete(0, 2);
		System.out.println(strbuilderOb);
		
		//replace
		strbuilderOb.replace(0, 1, "First");
		System.out.println(strbuilderOb);
		
		//reverse
		strbuilderOb.reverse();
		System.out.println(strbuilderOb);
	}

}
