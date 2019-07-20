package br.com.example.howto;

import java.util.Arrays;import java.util.stream.Collector;
import java.util.stream.Collectors;

public class SilvioBuble {

	/*public static void main(String[] args) {

		int[] vetor = {5,4,3,2,6,1};
		int aux = 0;
		
		System.out.println("Vetor antes: " + Arrays.stream(vetor).boxed().collect(Collectors.toList()));
		
		for(int i =0; i< vetor.length; i++){
			
			for(int j=0; j < vetor.length-1; j++){
				
				if(vetor[j] > vetor[j+1]){
					aux = vetor[j];
					vetor[j] = vetor[j+1];
					vetor[j+1] = aux;
				}
				
			}
			
		}
		
		System.out.println("Vetor depois: " + Arrays.stream(vetor).boxed().collect(Collectors.toList()));
	}*/
	
	
	/*public static void main(String[] args) {
		int vetor[] = {5,4,3,2,1,6,1};
		int aux = 0;
		
		System.out.println(Arrays.stream(vetor).boxed().collect(Collectors.toList()));
		
		for(int i=0; i< vetor.length-1;i++) {
			
			for(int j=0; j<vetor.length-1;j++) {
				
				if(vetor[j] > vetor[j+1]) {
					aux = vetor[j];
					vetor[j] = vetor[j+1];
					vetor[j+1] = aux;
				}
			}
			
		}
		
		System.out.println(Arrays.stream(vetor).boxed().collect(Collectors.toList()));
	}*/
	
	public static void main(String[] args) {
		int vetor[] = {8,1,2,3,4,5,6,7};
		int aux = 0;
		
		Arrays.stream(vetor).boxed().collect(Collectors.toList());
		
		for(int i = 0; i < vetor.length -1; i ++) {
			for(int j=0; j < vetor.length - 1; j++) {
				if(vetor[j] > vetor[j +1]) {
					aux = vetor[j];
					vetor[j] = vetor[j+1];
					vetor[j + 1] = aux;
				}
			}
		}
	}

}
