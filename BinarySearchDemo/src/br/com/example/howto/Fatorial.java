package br.com.example.howto;

public class Fatorial {

	public static void main(String[] args) {
		
		System.out.println(calcFactorialRecur(4));
	}
	
	public static int calcFatorial(int n) {
		
		int fat = 1;
		
		while(n > 1) {
			
			fat *= n;
			n--;
		}
		
		return fat;
	}
	
	public static int calcFactorialRecur(int n) {
		
		if(n == 0) {
			return 1;
		}
		return n = n * calcFactorialRecur(n-1);
	}

}
