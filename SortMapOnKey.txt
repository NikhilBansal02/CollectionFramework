package collectionframework;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortMapOnKey {

	public static void main(String[] args) {
		Map<Character, String> map = new HashMap<Character, String>();
		map.put('p', "pqr");
		map.put('x', "xyz");
		map.put('a', "abc");
		
		System.out.println(map);
		TreeMap<Character, String> lhmap = new TreeMap<Character, String>(map);
		System.out.println(lhmap);
		
		
	}

}
