package br.com.example.howto;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FinDuplicateCharacters{
    public static void main(String args[]){
    	printDuplicateCharacters("ssilvioi");
    }

public static void printDuplicateCharacters(String word){
    char[] characters = word.toCharArray(); 

    Map<Character, Integer> charMap = new HashMap<Character, Integer>();
    for(Character ch : characters){
        if(charMap.containsKey(ch)){
            charMap.put(ch, charMap.get(ch) + 1);
        }else{
            charMap.put(ch, 1);
        }
    }

    Set<Map.Entry<Character, Integer>> entrySet = charMap.entrySet();
    for(Map.Entry<Character, Integer> entry : entrySet){
        if(entry.getValue() > 1){
            System.out.printf("%s: %d %n", entry.getKey(), entry.getValue());
        }
    }
}

public static void print(String word) {
	char[] characters = word.toCharArray();
	
	Map<Character, Integer> charMap = new HashMap<>();
	
	for(Character ch : characters) {
		if(charMap.containsKey(ch)) {
			charMap.put(ch, charMap.get(ch) + 1);
		}else {
			charMap.put(ch, 1);
		}
	}
	
	Set<Map.Entry<Character, Integer>> mapEntry = charMap.entrySet();
	
	for(Map.Entry<Character, Integer> entry: mapEntry) {
		if(entry.getValue() > 1) {
			System.out.printf("%s: %d %n", entry.getKey(), entry.getValue());
		}
	}
	
}

}