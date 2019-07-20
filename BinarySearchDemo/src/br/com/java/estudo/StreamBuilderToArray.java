package br.com.java.estudo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamBuilderToArray {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		for (int i = 1; i < 10; i++) {
			list.add(i);
		}
		
		Stream<Integer> stream = list.stream();
		Integer[] evenNumberArr = stream.filter(i -> i%2 == 0).toArray(Integer[]::new);
		System.out.println(evenNumberArr);
	}
}
