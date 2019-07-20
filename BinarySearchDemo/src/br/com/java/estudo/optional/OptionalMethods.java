package br.com.java.estudo.optional;

import java.util.Optional;

public class OptionalMethods {

	public static void main(String[] args) {
		
		Optional<Integer> possible = Optional.empty();
		
		Optional<Integer> possible2 = Optional.of(5);
		
		Optional<Integer> possible3 = Optional.ofNullable(null);
		//or
		Optional<Integer> possible4 = Optional.ofNullable(5);
	}
}
