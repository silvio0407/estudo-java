package br.com.java.estudo;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class StreamForEachMap {

	public static void main(String[] args) {
		
		HashMap<String, Integer> map = new HashMap<>();
		
		map.put("A", 1);
		map.put("B", 2);
		map.put("C", 3);
		
		Consumer<Map.Entry<String, Integer>> action = System.out::println;
		
		map.entrySet().forEach(action);
		
		//2. Map keys
		Consumer<String> actionOnKeys = System.out::println;
		 
		map.keySet().forEach(actionOnKeys);
		 
		//3. Map values
		Consumer<Integer> actionOnValues = System.out::println;
		 
		map.values().forEach(actionOnValues);
	}
}
