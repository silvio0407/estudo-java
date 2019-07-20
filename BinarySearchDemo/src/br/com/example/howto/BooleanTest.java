package br.com.example.howto;

import java.util.ArrayList;
import java.util.List;

public class BooleanTest {
	
	public final static Integer GDOC_VALIDO = 1;
	
	public final static Integer GDOC_INVALIDO = 2;
	
	public final static Integer GDOC_NAO_PREENCHIDO = 3;
	

	public static void main(String[] args) {

		String numeroPge = null /*"123455"*/;
		
		boolean isValidoPge = validaNumeroPge(numeroPge);
		
		/*boolean isValidoGdoc*/Integer identificadorGdoc = validaGdoc("1", "1", "");
		
		System.out.println("PGE: " + isValidoPge);
		
		System.out.println("GDOC: " + (identificadorGdoc == 1 ? "GDOC Válido" : identificadorGdoc == 2 ? "GDOC Inválido": "GDOC Não Preenchido"));
		
		System.out.println("Verificando se continua processamento......");
		
		if((isValidoPge & ((identificadorGdoc == 1) || identificadorGdoc == 3))  || identificadorGdoc == 1){
			
			System.out.println("Processando dados GDOC com PGENet.....");
		}/*else if(identificadorGdoc == 1){
			System.out.println("Processando GDOC sem PGENet.....");
		}*/else if(identificadorGdoc == 3 & isValidoPge == false){
			System.out.println("Favor informar ao menos uma das opcoes GDOC ou PGENet.");
		}else{
			System.out.println("Aviso dados Gdoc Invalido.....");
		}
		
	}
	
	public static boolean validaNumeroPge(String numeroPge){
		
		boolean isValidoNumeroPge = numeroPge != null ? true : false;
		
		return isValidoNumeroPge;
	}
	
	public static Integer validaGdoc(String valorA, String valorB, String valorC){
		
		boolean isEmptyValorA = false;
		boolean isEmptyValorB = false;
		boolean isEmptyValorC = false;
		
		if("".equals(valorA)){
			isEmptyValorA = true;
		}
		
		if("".equals(valorB)){
			isEmptyValorB = true;
		}
		
		if("".equals(valorC)){
			isEmptyValorC = true;
		}
		
		List<Boolean> lista = new ArrayList<>();
		
		lista.add(isEmptyValorA);
		lista.add(isEmptyValorB);
		lista.add(isEmptyValorC);
		
		//boolean isValidoGdoc = false;
		
		if(isEmptyValorA & isEmptyValorB & isEmptyValorC){
			System.out.println("Valores Vazios, GDOC não é necessário");
			return GDOC_NAO_PREENCHIDO;
		} else {
			
			System.out.println("Valores GDOC preenchidos");
			
			System.out.println("************** Verificando se tem campo inválido!!!");
			
			boolean any = lista.stream().anyMatch(b -> true);
			
			if(any){
				System.out.println("Enviar warning, valor GDOC invalido!");
				return GDOC_INVALIDO;
			}else{
				//isValidoGdoc = true;
				
				System.out.println("Valores GDOC estão OK!");
				
				return GDOC_VALIDO;
			}
			
		}
		
		
		
		//return isValidoGdoc;
	}

}
