package br.com.java.estudo.method.reference;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReferenceMethod {

	public static void main(String[] args) {

		List<Integer> integrs = Arrays.asList(1,12,433,5);
		
		Optional<Integer> max = integrs.stream().reduce(Math::max);
		
		System.out.println(max);
		
		max.ifPresent(System.out::print);
	}

}
