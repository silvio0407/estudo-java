package br.com.example.howto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListaComparacao {

	/*
	 * public static void main(String[] args) {
	 * 
	 * List<Integer> aA = Stream.of(1,2,3,4,5,6).collect(Collectors.toList());
	 * List<Integer> aB = Stream.of(7,8,9,10).collect(Collectors.toList());
	 * 
	 * int min = 0; int max = 0;
	 * 
	 * for(int i=0; i< aA.size() - 1; i++) {
	 * 
	 * }
	 * 
	 * System.out.printf("valor minimo: %d", min); }
	 */

	/*public static void main(String[] args) {
		boolean diferente = true;
		List<Integer> listaDiferente = new ArrayList<Integer>();
		Integer aux = 0;
		Integer aux2 = 0;
		List<Integer> l1 = new ArrayList<Integer>();
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(4);
		l1.add(9);
		l1.add(5);
		List<Integer> l2 = new ArrayList<Integer>();
		l2.add(2);
		l2.add(3);
		l2.add(4);
		l2.add(5);
		l2.add(7);
		for (int i = 0; i < l1.size(); i++) {
			aux = l1.get(i);

			if (l1.contains(aux)) {
				System.out.println("Esse elemento faz parte da lista 1 - " + aux);
			}
			// se quiser comparar se existe na lista 2
			if (l2.contains(aux)) {
				System.out.println("Esse elemento existe na lista 2 - " + aux);
			} else {
				listaDiferente.add(aux);
			}

		}
		System.out.println("lista de diferentes = " + listaDiferente);

	}*/
	
	public static void main(String[] args) {
		List<Integer> l1 = Arrays.asList(1,2,6,3,4);
		List<Integer> l2 = Arrays.asList(1,6,0,7,8,9);
		
		retornaMinMax(l1,l2);
	}

	public List<Integer> retornaElementosDiferentesL1(List<Integer> l1, List<Integer> l2) {
		boolean diferente = true;
		List<Integer> listaDiferente = new ArrayList<Integer>();
		int aux = 0;
		int aux2 = 0;
		for (int i = 0; i < l1.size(); i++) {
			aux = l1.get(i);
			for (int j = 0; j < l2.size(); j++) {
				aux2 = l2.get(j);
				if (aux == aux2)
					diferente = false;
			}
			if (diferente == true)
				listaDiferente.add(aux);
		}
		System.out.println("lista de diferentes = " + listaDiferente);
		return listaDiferente;
	}
	
	public static void retornaMinMax(List<Integer> l1, List<Integer> l2) {

		int min = 0;
		int max = 0;
		/*
		 customers.stream() 
          .filter(c -> c.getTrack() != null)
          .map(c -> c.getTrack().getId())
          .flatMap(id -> tracks.stream().filter(track -> Long.valueOf(track.getId()).equals(id)))
          .collect(Collectors.toSet());
          */
		
		// Get Min or Max Number
		List<Integer> list = Stream.concat(l1.stream(), l2.stream()).collect(Collectors.toList());
		
		Integer maxNumber2 = list.stream()
                .max(Comparator.comparing(Integer::valueOf))
                .get();
		
		Integer maxNumber3 = list.stream()
                .min(Comparator.comparing(Integer::valueOf))
                .get();
		
		System.out.println("Minimo: " +maxNumber2);
		System.out.println("Maximo: " +maxNumber3);
		
		//List<Integer> maxNumber = l1.stream().filter(a -> a.intValue() >= 1).mapToInt().collect(Collectors.toList());
		
		//System.out.println(l1.stream().max(Comparator.comparing(Integer::valueOf)).get());
		
	}

}
