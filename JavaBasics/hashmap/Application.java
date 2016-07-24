package hashmap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Application {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(5, "Five");
		map.put(6, "Six");
		map.put(8, "Eight");
		map.put(4, "Four");
		map.put(2, "Two");
		map.put(4, "Four-2");
		
		String text = map.get(4);
		
		System.out.println(text);
		
		// Iterate through map
		for(Map.Entry<Integer, String> entry: map.entrySet()) {
			int key = entry.getKey();
			String value = entry.getValue();
			
			System.out.println(key + ": " + value);
		}
		
		// Linked hashmap and tree map
		LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
		testMap(linkedHashMap);
		testMap(treeMap);
	}
	
	private static void testMap(Map<Integer, String> map) {
		map.put(9, "Fox");
		map.put(4, "Dog");
		map.put(8, "Cat");
		map.put(1, "Lion");
		map.put(0, "Snake");
		
		for(Integer key: map.keySet()) {
			String value = map.get(key);
			System.out.println(key + ": " + value);
		}
	}

}
