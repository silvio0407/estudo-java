package br.com.example.howto;

import java.util.Arrays;

public class PalindromoStream {

	public static void main(String[] args) {

		int[] array = { 101, 10, 11, 50005, 5500055, 1,1616, 1661 };
		Arrays.stream(array).filter(PalindromoStream::isPalindrome).peek(System.out::println).count();
	}

	public static boolean isPalindrome(int numero) {
		boolean isPalindromo = true;
		for (int i = 0; i < String.valueOf(numero).toCharArray().length; i++) {
			if (String.valueOf(numero).charAt(i) != String.valueOf(numero)
					.charAt(String.valueOf(numero).toCharArray().length - i - 1)) {
				isPalindromo = false;
				break;
			}
		}
		return isPalindromo;
	}
}
