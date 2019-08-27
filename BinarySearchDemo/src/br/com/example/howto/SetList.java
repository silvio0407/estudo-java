package br.com.example.howto;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetList {

	public static void main(String[] args) {
		
		Set<List<String>> setLits = new HashSet<>();
		
		List<String> str = new ArrayList<String>();
		
		str.add("a");
		str.add("b");
		
		List<String> str2 = new ArrayList<String>();
		
		str2.add("a");
		str2.add("b");
		str2.add("c");
		
		setLits.add(str);
		setLits.add(str2);
		
		
		setLits.forEach(System.out::println);
	}
}
