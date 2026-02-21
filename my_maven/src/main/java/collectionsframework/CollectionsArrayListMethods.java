package collectionsframework;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionsArrayListMethods {

	public static void main(String[] args) 
	
	{
	   ArrayList arrList=new ArrayList(); //non generic ArrayList
	   arrList.add("Hi");
	   arrList.add(10);
	   arrList.add('d');
	   arrList.add(10.1f);
    	System.out.println(arrList);
		
		//Generic ArrayList
    	
    	//add - to add elements
		
		ArrayList <String> arrList1=new ArrayList(); // generic
		arrList1.add("AA");
		arrList1.add("BB");
		arrList1.add("CC"); 
		System.out.println(arrList1);
		
		ArrayList <String> arrList2=new ArrayList(); // generic
		arrList2.add("Red");
		arrList2.add("Blue");
		arrList2.add("Green");
		System.out.println(arrList2);
		
		
		//remove
		arrList2.remove(0);
		System.out.println(arrList2);
		
		
		//add all  - merge 1 generic arraylist to another generic arraylist
		arrList2.addAll(arrList1);
		System.out.println(arrList2);
		
		//Remove all ->to remove all elements
		
		arrList.removeAll(arrList);
		System.out.println(arrList);
		
		//get -> to get/fetch an element based on index number
		 System.out.println(arrList2.get(1));	
		 
		 //to get the size  -size()
		 System.out.println(arrList2.size());	
		 
		 
		 //contains()  -> is that element contains or not
		 boolean s=arrList2.contains("Blue");
		 System.out.println(s);	
		 
		 boolean s1=arrList2.contains("black");
		 System.out.println(s1);
		 
		 
		 Iterator itr=arrList2.iterator();
		 while(itr.hasNext()) //check the 0th index element ->Yes->go to loop and print it
		 {
			 System.out.println(itr.next());	
			 
		 }
		 
		 itr.remove();
		 System.out.println(arrList2);
	}

}
