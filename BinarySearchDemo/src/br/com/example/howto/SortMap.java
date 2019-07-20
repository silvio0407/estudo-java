package br.com.example.howto;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortMap {

	/*public static void main(String[] args) {
		
		Map<String, Integer> unsortMap = new HashMap<>();
		
		unsortMap.put("z", 10);
		unsortMap.put("b", 5);
		unsortMap.put("a", 6);
		unsortMap.put("c", 20);
		unsortMap.put("d", 1);
		
		System.out.println("Original...");
		
		System.out.println(unsortMap);
		
		Map<String, Integer> result = unsortMap.entrySet().stream().sorted(Map.Entry.comparingByKey()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(oldValue, newValue) -> oldValue, LinkedHashMap::new));
		 System.out.println(result);
	}*/
	
	public static void main(String[] args) {

		Map<String, Integer> unsort = new HashMap<>();
		unsort.put("z", 10);
		unsort.put("b", 5);
		unsort.put("a", 6);
		unsort.put("c", 20);
		unsort.put("d", 1);
		
		Map<String, Integer> result = unsort.entrySet().stream().sorted(Map.Entry.comparingByKey()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		System.out.println(result);
		
		
	}
}
