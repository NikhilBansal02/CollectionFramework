package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMap1 {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();
		hmap.put(1, "nikhil");
		hmap.put(10, "rock");
		hmap.put(6, "rock");
		hmap.put(2, "goldberg");
		hmap.put(3, "rock");
		
		
		/*Set set = hmap.entrySet();
		Iterator itr = set.iterator();
		
		while(itr.hasNext()) {
			Map.Entry entry = (Map.Entry)itr.next();
			System.out.println(entry.getKey() + " "+ entry.getValue());
		}*/
		
		for(Map.Entry entry : hmap.entrySet())
			System.out.println(entry.getKey() + " "+ entry.getValue());
		
	}

}
