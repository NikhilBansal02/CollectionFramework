package collections;

import java.util.LinkedHashSet;
import java.util.Iterator;
public class LinkedHashSet1 {

	public static void main(String[] args) {
		
		LinkedHashSet<String> hset = new LinkedHashSet<String>();
		hset.add("a");
		hset.add("v");
		hset.add("c");
		hset.add("d");
		hset.add("c");
		
		Iterator<String> itr = hset.iterator();
		
		while(itr.hasNext())
			System.out.println(itr.next());
	}

}
