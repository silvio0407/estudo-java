package br.com.example.howto;

public class PalindromoStream {

	public static void main(String[] args) {

		
		/*int[] array = { 101, 10, 11, 50005, 5500055, 1,1616, 1661 };
		long inicio = System.currentTimeMillis();
		long i = Arrays.stream(array).filter(PalindromoStream::isPalindrome).peek(System.out::println).count();
		System.out.println("Quantidade de Palindromos: " + i);
		long fim = System.currentTimeMillis();
		  SimpleDateFormat sdf = new SimpleDateFormat("mm:ss SSSSS");  
		  System.out.println(sdf.format(new java.util.Date(fim - inicio)));*/
		  isPalindrome(9, 10000);
	}

	/*public static boolean isPalindrome(int numero) {
		boolean isPalindromo = true;
		for (int i = 0; i < String.valueOf(numero).toCharArray().length; i++) {
			if (String.valueOf(numero).charAt(i) != String.valueOf(numero)
					.charAt(String.valueOf(numero).toCharArray().length - i - 1)) {
				isPalindromo = false;
				break;
			}
		}
		return isPalindromo;
	}*/
	
	public static void isPalindrome(int a, int b) {
	
		for (int i = a; i <= b; i++) {
			boolean isPalindromo = true;
			char[] num = String.valueOf(i).toCharArray();
			for(int index = 0; index < num.length; index++)
			{
				if (num[index] != num[num.length -index -1]) {
					isPalindromo = false;
					break;
				}
			}
			
			if(isPalindromo)
				System.out.println(i);
		}
	}
}
