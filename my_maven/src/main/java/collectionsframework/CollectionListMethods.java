package collectionsframework;

import java.util.ArrayList;
import java.util.List;

import com.graphbuilder.struc.LinkedList;

public class CollectionListMethods {

	public static void main(String[] args) {


		// Adding elements to the LinkedList using add() method
				List l1=new ArrayList(); //non generic ArrayList
				l1.add("Hi");
				l1.add("ABC");
				System.out.println(l1);
					
					//Generic LinkedList
				List<String> l2=new ArrayList(); //non generic ArrayList
				l2.add("AA");
				l2.add("BB");
				System.out.println(l2);
				
				l2.remove(0);
				System.out.println(l2);
				
				//add all  - merge 1 generic arraylist to another generic arraylist
				l2.addAll(l1);
				System.out.println(l2);
				
				//get -> to get/fetch an element based on index number
				 System.out.println(l2.get(1));	
				 
				 //to get the size  -size()
				 System.out.println(l2.size());	
				 
				 //contains()  -> is that element contains or not
				 boolean s=l2.contains("Blue");
				 System.out.println(s);	
				 
				 boolean s1=l2.contains("BB");
				 System.out.println(s1);
	}

}
