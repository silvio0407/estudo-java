package br.com.java.estudo.defaultt.method;

import java.util.ArrayList;
import java.util.List;

public class Animal implements Moveable {

	public static void main(String[] args) {
		List<Animal> list = new ArrayList<>();
		list.add(new Animal());
		list.add(new Animal());
		list.add(new Animal());
		
		list.forEach((Moveable p) -> p.move());
	}
}
