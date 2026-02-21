package collectionsframework;

import java.util.LinkedList;

public class CollectionLinkedListMethods {

	public static void main(String[] args) 
	
	{    
		// Adding elements to the LinkedList using add() method
		LinkedList ll1=new LinkedList(); //non generic ArrayList
		ll1.add("CC");
		System.out.println(ll1);
			
			//Generic LinkedList
		LinkedList linkedList2=new LinkedList();
		linkedList2.add("AA");
	    linkedList2.add("BB");
		linkedList2.add("CC");
		System.out.println(linkedList2);
		
		//get -> to get/fetch an element based on index number
		 System.out.println(linkedList2.get(1));	
		 
		 //to get the size  -size()
		 System.out.println(linkedList2.size());	
		
		
    	
	    	
	}

}
