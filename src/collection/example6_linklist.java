package collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class example6_linklist {
public static void main(String[] args) {
	LinkedList l1=new LinkedList();
	l1.add("sonali");
	l1.add("rachna");
	l1.add('A');
	l1.add(106);
	l1.add(null);
	l1.add(null);
	l1.add(null);
	
	System.out.println(l1);
	System.out.println(l1.size());
	
	l1.add(2, 111);
	System.out.println(l1);
	
	System.out.println("-----iterator------");
	Iterator itr = l1.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	System.out.println("-----listiterator------");
	ListIterator litr = l1.listIterator();
	while(litr.hasNext())
	{
		System.out.println(litr.next());
	}
	System.out.println("for loop");
	for(int i=0; i<=l1.size()-1; i++)
	{
		System.out.println(l1.get(i));
	}
	System.out.println("-----for eeach------");
	for(Object l2:l1)
	{
		System.out.println(l2);
	}
	
	
	
	
	
	
	
	
	
}
}
