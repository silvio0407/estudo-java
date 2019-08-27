package br.com.example.howto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamLearning {

	 public static void main(String[] args) {
		 Stream<Integer> stream = Stream.of( new Integer[]{1,2,3,4,5,6,7,8,9} );
         stream.forEach(p -> System.out.println(p));
         
         IntStream stream2 = "12345_abcdefg".chars();
         stream2.forEach(p -> System.out.println(p));
          
         //OR
          
         Stream<String> stream3 = Stream.of("A$B$C".split("\\$"));
         stream3.forEach(p -> System.out.println(p));
         
         List<String> nomes = new ArrayList<>();
         nomes.add("silvio");
         nomes.add("sandra");
         
         nomes.stream().filter(c -> c.startsWith("s"))
         .map(String::toUpperCase)
         .collect(Collectors.toList())
         .forEach(System.out::println);
         
         Optional<String> reduced = nomes.stream().reduce((a,b) -> a + "#" + b);
         
         reduced.ifPresent(System.out::println);
         
         comparaLista();
     }
	 
	 public static void comparaLista() {
		 
		 List<Integer> lista1 = Arrays.asList(1,2,3,4,0);
		 
		 List<Integer> lista2 = Arrays.asList(9,8,7,6,5);
		 
		 Stream.concat(lista1.stream(), lista1.stream());
		 
		   Optional<Integer> minNumber = lista1.stream().min((c,d) -> c.compareTo(d));
		   
		   System.out.println(minNumber.get());
	 }
}
