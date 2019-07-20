package br.com.example.howto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EstudoAlgoritmos {

	public static void main(String[] args) {

		
		List<String> lista = new ArrayList<>();
		
		lista.add("F");
		lista.add("D");
		lista.add("S");
		lista.add("A");
		lista.add("I");
		lista.add("C");
		
		String vetor[] = lista.toArray(new String[0]);
		
		
		ordenar2(lista);
		//Collections.sort(lista);
		
		int result = binarySearch(lista, "Z");
		
		System.out.println(result);
		
	}
	
	private static void ordenar(List<String> lista){
		
		
		String aux = null;
		
		boolean ordenado = false;
		
		do{
			ordenado = true;
			
			for(int i = 0; i< lista.size() -1; i++){
				
				if(lista.get(i).compareTo(lista.get(i + 1)) > 0){
					lista.add(i,lista.get(i + 1));
					lista.remove(i+2);
					ordenado = false;
					System.out.println("Lista iteracao: " + i + " " + lista);
				}
			}
			
		}while(!ordenado);
		
		System.out.println("Lista Ordenada: " + lista);
		
	}
	
	private static void ordenar2(List<String> lista) {
		boolean ordenado = false;
		
		do {
			
			ordenado = true;
			for(int i = 0; i < lista.size() -1; i++){
				
				if(lista.get(i).compareTo(lista.get(i+1)) > 0) {
					
					lista.add(i, lista.get(i+1));
					lista.remove(i+2);
					ordenado = false;
					
					System.out.println("Lista iteracao: " + i + " " + lista);
				}
			}
			
			
		}while(!ordenado);
	}


	private static int binarySearch(List<String> lista, String string) {
		
		int low = 0;
		int high = lista.size() - 1;
		int mid = (low + high) / 2;
		
		while(low <= high && !lista.get(mid).equalsIgnoreCase(string)){
			
			if(lista.get(mid).compareTo(string) < 0){
				low = mid + 1;
			}else{
				high = mid -1;
			}
			
			mid = (low + high) / 2;
			
			if (low > high) {
                mid = -1;
            }
			
		}
		
		return mid;
		
	}
	
	private static int find(List<String> lista, String word) {
		
		int low = 0;
		int high = lista.size() - 1;
		int mid = (low + high) / 2;
		
		while(low <= high && !lista.get(mid).equalsIgnoreCase(word)) {
			
			if(lista.get(mid).compareTo(word) < 0) {
				low = mid + 1;
			}else {
				high = mid - 1;
			}
			
			mid = (low + high) / 2;
			
			if(low > high) {
				mid = -1;
			}
			
			
		}
		return mid;
	}

}
