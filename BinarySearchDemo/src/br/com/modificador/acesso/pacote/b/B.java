package br.com.modificador.acesso.pacote.b;

import br.com.modificador.acesso.pacote.a.A;

public class B extends A {

	int b = 0;
	public static void main(String[] args) {
		B b = new B();
		
		b.a = 1;

		System.out.println(b.a+b.b);
	}
}
