package collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class example_linkedlist1 {
public static void main(String[] args) {
	LinkedList li=new LinkedList();
	li.add("gopal");
	li.add(101);
	li.add(101);
	li.add('a');
	li.add(null);
	li.add(null);
	
	System.out.println(li);
	System.out.println(li.size());
	System.out.println(li.get(0));
	
	li.set(0, "moon");
	System.out.println(li);
	li.remove(1);
	System.out.println(li);
	
	System.out.println("itertr");
	Iterator itr = li.iterator();
	while (itr.hasNext()) {
	System.out.println(itr.next());
		
	}
	System.out.println("listitrtr");
	ListIterator litr = li.listIterator();
	while (litr.hasNext()) {
		System.out.println(litr.next());
		
	}
	for(int i=0; i<=li.size()-1; i++)
	{
		System.out.println(li.get(i));
	}
	 System.out.println("for each");
	 for(Object li1:li)
	 {
		 System.out.println(li1);
	 }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
