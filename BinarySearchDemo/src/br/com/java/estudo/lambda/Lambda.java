package br.com.java.estudo.lambda;

import java.util.ArrayList;
import java.util.List;

public class Lambda {

	public static void main(String[] args) {

		List<String> pointList = new ArrayList<>();
		pointList.add("1");
		pointList.add("2");
		
		pointList.forEach(p -> {
			System.out.println(p);
		});
		
		new Thread(
				() -> System.out.println("my Runnable")
				);
	}

}
