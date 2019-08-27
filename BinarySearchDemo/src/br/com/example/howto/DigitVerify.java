package br.com.example.howto;

public class DigitVerify {

	public static void main(String[] args) {
		
		String s = "silvi123";
		
		char[] c = s.toCharArray();
		boolean d = true;

		for ( int i = 0; i < c.length; i++ ) {
		    // verifica se o char não é um dígito
			if(!Character.isDigit(s.charAt(i)))
		    //if ( !Character.isDigit( c[ i ] ) ) {
		        d = false;
		        //break;
		    }
		
		String a = "a2w5sd6545";
		if(a.contains("^[a-Z]"))System.out.println("Tem letras");
		else System.out.println("Apenas numeros");

		//return d;
	}
}
