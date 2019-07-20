package br.com.example.howto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BubleSort {

	public static void main(String[] args) {
		 int[] vet = {8, 9, 3, 5, 1,7};
		    int aux = 0;
		    int i = 0;
		     
		    System.out.println("Vetor desordenado: ");
	    for(i = 0; i<vet.length; i++){
	        System.out.println(" "+vet[i]);
	    }
	    System.out.println(" ");
	     
	    for(i = 0; i<vet.length; i++){
	        for(int j = 0; j<vet.length-1; j++){
	            if(vet[j] > vet[j + 1]){
	                aux = vet[j];
	                vet[j] = vet[j+1];
	                vet[j+1] = aux;
	            }
	        }
	        System.out.println("Vetor " + i + "\n");
	       List lista = Arrays.asList(1,2,34,5);
	       Integer l = (Integer)lista.get(0);
	    }
	    System.out.println("Vetor organizado:");
	    for(i = 0; i<5; i++){
	        System.out.println(" "+vet[i]);
		    }
	}
}
