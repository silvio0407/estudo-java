package br.com.example.howto;

public class Teste {

	public static void main(String[] args) {

		try {
			System.out.println(1);
			System.exit(0);
		} finally {
			System.out.println(0);
		}
	}

}
