package br.com.java.estudo;

import java.util.ArrayList;
import java.util.List;

public class StreamOperationsFindFirst {

	public static void main(String[] args) {

		List<String> memberNames = new ArrayList<>();
		memberNames.add("Amitabh");
		memberNames.add("Shekhar");
		memberNames.add("Aman");
		memberNames.add("Rahul");
		memberNames.add("Shahrukh");
		memberNames.add("Salman");
		memberNames.add("Yana");
		memberNames.add("Lokesh");

		String firstMatchedName = memberNames.stream().filter((s) -> s.startsWith("A")).findFirst().get();

		System.out.println(firstMatchedName);
	}

}
