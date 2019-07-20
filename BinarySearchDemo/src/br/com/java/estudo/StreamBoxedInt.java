package br.com.java.estudo;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamBoxedInt {

	public static void main(String[] args) {

		List<Integer> ints = IntStream.of(1,2,3,4,5).boxed().collect(Collectors.toList());
		
		System.out.println(ints);
		
		Optional<Integer> max = IntStream.of(1,2,3,4,5)
						.boxed()
						.max(Integer::compareTo);
		System.out.println(max);
	}

}
