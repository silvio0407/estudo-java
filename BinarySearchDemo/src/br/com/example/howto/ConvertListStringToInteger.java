package br.com.example.howto;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConvertListStringToInteger {

	public static void main(String[] args) {


		List<String> stringList = Arrays.asList("1","2");
		
		List<String> l1 = Arrays.asList("1", "2", "3");
		List<Integer> r1 = l1.stream().map(Integer::parseInt).collect(Collectors.toList());

		// the longer full lambda version:
		List<Integer> r2 = l1.stream().map(s -> Integer.parseInt(s)).collect(Collectors.toList());
		
		/*Stream<Integer> collect*/Stream<Map.Entry<Integer,List<Integer>>> listGroupingByIp = Stream.of(2, 5, 7, 8, 2, 3, 5, 6, 5)
	            .collect(Collectors.groupingBy(e -> e)).entrySet().stream()
	            .filter(e -> e.getValue().size() == 2);
				
	     //List<Integer> result = collect.collect(Collectors.toList());
		
		
	     listGroupingByIp.forEach(System.out::println);
		
		System.out.println("");

	}

}
