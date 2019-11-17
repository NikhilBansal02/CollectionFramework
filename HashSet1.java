package collections;

import java.util.HashSet;
import java.util.Iterator;
public class HashSet1 {

	public static void main(String[] args) {
		
		HashSet<String> hset = new HashSet<String>();
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
