package collection;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class example8_linkedhashset {
public static void main(String[] args) {
	LinkedHashSet lhs=new LinkedHashSet();
	lhs.add("sabhyata");
	lhs.add("moon");
	lhs.add("moon");
	lhs.add(102);
	lhs.add('A');
	lhs.add(null);
	lhs.add(102);
	lhs.add(null);
	
	
	System.out.println(lhs);
	System.out.println(lhs.size());
	System.out.println(lhs.isEmpty());
	lhs.remove(102);
	System.out.println(lhs);
	
	System.out.println("--------iterator-----");
	Iterator itr = lhs.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	
	System.out.println("------for each------");
	for(Object lhs1:lhs)
	{
		System.out.println(lhs1);
	}
	
	
	
	
	
	
	
}
}
