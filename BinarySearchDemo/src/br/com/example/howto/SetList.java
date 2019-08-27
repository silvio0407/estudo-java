package br.com.example.howto;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

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
		
		List<Integer> str3 = new ArrayList<>();
		
		str3.add(1);
		str3.add(2);
		
		List<Integer> str4 = new ArrayList<>();
		
		str4.add(1);
		str4.add(2);
		str4.add(3);
		
		setLits.add(str);
		setLits.add(str2);
		setLits.add(str3.stream().map(String::valueOf).collect(Collectors.toList()));
		setLits.add(str4.stream().map(String::valueOf).collect(Collectors.toList()));
		
		
		setLits.forEach(System.out::println);
	}
}
