package collectionsframework;

import java.util.ArrayList;

import com.graphbuilder.struc.LinkedList;

public class ForEachLoopSampleClass {

	public static void main(String[] args) 
	{
		 ArrayList<String> arrList=new ArrayList(); //generic ArrayList
		 arrList.add("AA");
		 arrList.add("BB");
		 arrList.add("CC");
		 arrList.add("DD");
		 arrList.add("EE");
		 arrList.add("FF");
		   
		 for(String s : arrList)
		   {
	    	System.out.println(s);
		   }

		 
		/* LinkedList ll=new LinkedList(); 
		 ll.add(111);
		 ll.add(222);
		 ll.add(333);
		 
		 for(int a: ll)
		   {
	    	System.out.println(a);
		   }*/
		 
		 
		 ArrayList<Integer> k=new ArrayList(); //generic ArrayList
		 k.add(1);
		 k.add(2);
		 k.add(3);
		 for(int g: k)
		   {
	    	System.out.println(g);
		   }
	}

}
