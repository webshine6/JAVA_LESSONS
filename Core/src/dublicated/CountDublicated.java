package dublicated;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CountDublicated {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("b");
		list.add("c");
		list.add("a");
		list.add("a");
		list.add("a");

		Map<String, Integer> map = new HashMap();

		for (String temp : list) {
			// връща стойността по даден ключ;
			// -- ако такава няма, се връща null
			Integer count = map.get(temp);
			map.put(temp, (count == null) ? 1 : count + 1);
		}

		System.out.println("Count all with Hashmap");
		printMap(map);

		boolean result = map.isEmpty();
		System.out.println("---> containsKey \"l\"? - " + map.containsKey("l"));
		System.out.println("---> map size: " + map.size());
	}

	public static void printMap(Map<String, Integer> map) {

		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println("Map key: " + entry.getKey() + ", map value: " + entry.getValue());
		}

	}

}
