package br.com.java.estudo;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamBuilderToken {

	public static void main(String[] args) {
		IntStream stream = "12345_abcdefg".chars();
		stream.forEach(p -> System.out.println(p));
		
		  //OR
        
        Stream<String> stream2 = Stream.of("A$B$C".split("\\$"));
        stream2.forEach(p -> System.out.println(p));
	}

}
