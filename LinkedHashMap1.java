package collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMap1 {

	public static void main(String[] args) {
		LinkedHashMap<Integer,String> map = new LinkedHashMap<Integer,String>();
		
		map.put(1,"Nikhil1");
		map.put(1,"Nikhil2");
		map.put(null,"Nikhil3");
		map.put(null,"Nikhil4");
		map.put(5,"Nikhil5");

		System.out.println(map);
		for(Map.Entry<Integer, String> m : map.entrySet())
			System.out.println(m.getKey()+" "+m.getValue());
	}

}