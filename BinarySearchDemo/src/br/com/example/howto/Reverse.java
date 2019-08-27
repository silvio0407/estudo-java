package br.com.example.howto;

public class Reverse {

	public static void main(String[] args) {

		System.out.println(rev("silvio"));
	}
	
	private static String rever(String myString) {
		
		return myString
                .chars()
                .mapToObj(c -> String.valueOf((char) c))
                .reduce("", (sb, str) -> str + sb); 
	}
	
	
	private static String rev(String nome) {
		
		return nome.chars().mapToObj(c -> String.valueOf((char)c)).reduce("", (sb, str) -> str+sb);
	}
	
}
