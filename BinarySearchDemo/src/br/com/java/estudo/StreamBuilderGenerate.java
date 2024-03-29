package br.com.java.estudo;

import java.util.Date;
import java.util.stream.Stream;

public class StreamBuilderGenerate {

	public static void main(String[] args) {

		Stream<Date> stream = Stream.generate(() -> {
			return new Date();
		});
		
		stream.forEach(p -> System.out.println(p));
	}

}
