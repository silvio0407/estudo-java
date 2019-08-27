package br.com.example.howto;

public class Palindromo {

	public static void main(String[] args) {
		String nome = "ama";
		
		System.out.println("Palindromo: " + isPalindromo(nome));
	}
	
	static boolean isPalindromo(String nome) {
		for (int i = 0; i < nome.length()-1; i++) {
            if (nome.charAt(i) != nome.charAt(nome.length()-1-i)) {
                return false;
            }
        }
		
		return true;
	}

}
