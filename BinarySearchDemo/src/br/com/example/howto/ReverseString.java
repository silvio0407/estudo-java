package br.com.example.howto;

public class ReverseString {

	public static void main(String[] args) {
		
		String word = "Silvio";
		
		System.out.println(reverseRecursivo(word));
	}

	private static String reverse(String word) {

		char[] charWord = word.toCharArray();
		char[] newWord = new char[word.length()];
		
		for(int i=0; i< charWord.length; i++) {
			
			newWord[i] = charWord[charWord.length - i -1];
		}
		
		return new String(newWord);
	}
	
	private static String reverseRecursivo(String word) {
		
		if(word.length()==1) {
			return word;
		}
		
		return reverseRecursivo(word.substring(1)) + word.charAt(0);
	}
}
