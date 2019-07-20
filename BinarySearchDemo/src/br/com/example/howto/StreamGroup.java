package br.com.example.howto;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamGroup {

	public static void main(String[] args) {

		
	List <String> lis = Arrays.asList("1","2","3");
	
	List <Integer> lisInt = lis.stream().map(Integer::parseInt).collect(Collectors.toList());
	
	List<Integer> li = Stream.of(1,2,3,4).collect(Collectors.toList());
	
	lisInt.forEach(System.out::println);
	//Supplier<Stream<Integer>> streamSupplier =  () -> 
	/*Stream<Map.Entry<Integer, List<Integer>>>*/Stream lista	= Stream.of(1,2,3,4,5,1,2,3,4,5, 1, 5).collect(Collectors.groupingBy(e -> e)).entrySet().stream()
			.filter(e -> e.getValue().size() >= 2).map(Map.Entry::getValue);
	
	Stream<Map.Entry<Integer, List<Integer>>> lista2	= Stream.of(1,2,3,4,5,1,2,3,4,5, 1, 5).collect(Collectors.groupingBy(e -> e)).entrySet().stream();
	lista2.forEach(System.out::println);
	lista.forEach(System.out::println);
	
	Stream.of("a1", "b1").map(s -> {
		System.out.println("map: " + s);
        return s.toUpperCase();
	}).forEach(s -> System.out.println("forEach: " + s));
	
	Stream.of("d2", "a2", "b1", "b3", "c")
    .filter(s -> {
        System.out.println("filter: " + s);
        return s.startsWith("a");
    })
    
    .forEach(s -> System.out.println("forEach: " + s));

		
	}

}
