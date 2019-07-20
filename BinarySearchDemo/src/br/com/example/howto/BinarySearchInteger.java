package br.com.example.howto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchInteger {

	private final static int NOT_FOUND = -1;
	
	public static void main(String[] args) {
		
		List<Integer> binarySearchList = new ArrayList<Integer>();
		
		binarySearchList.add(2);
		binarySearchList.add(3);
		binarySearchList.add(4);
		binarySearchList.add(10);
		binarySearchList.add(40);

		
		//Collections.sort(binarySearchList);
		
		int l = 0;
		int r = binarySearchList.size() - 1;
		int mid = (l + r) / 2;
		
		long start = System.currentTimeMillis();
		int value = binarySearchFindWord(binarySearchList, 40);
		long elapsed = System.currentTimeMillis() - start;
		
		long startRecursivo = System.currentTimeMillis();
		int value2 = binarySearchFindWord2(binarySearchList, l,  r, 40);
		long elapsedRecursivo = System.currentTimeMillis() - startRecursivo;
		
		System.out.println("Tempo : " + elapsed);
		System.out.println("Tempo Recursivo : " + elapsedRecursivo );
		if (value == -1) {
            System.out.println("Search value not found");
        } else {
            System.out.println("Search value position: " + value);
        }
		
	}

	private static int binarySearchFindWord(List<Integer> binarySearchList, int wordFind) {
		int low = 0;
		int high = binarySearchList.size() - 1;
		int mid = (low + high) / 2;
		
		while(low <= high && !binarySearchList.get(mid).equals(wordFind)){
			
			if(binarySearchList.get(mid).compareTo(wordFind) < 0){
				low = mid + 1;
			}else{
				high = mid -1;
			}
			
			mid = (low + high) / 2;
			
			if (low > high) {
                mid = NOT_FOUND;
            }
			
		}
		return mid;
		
	}
	
private static int binarySearchFindWord2(List<Integer> binarySearchList, int l, int r, int wordFind) {
		if(r >= l){
			
			int mid =l + (r - l) / 2;
			
			if(binarySearchList.get(mid).equals(wordFind)){
				return mid;
			}
			
			if(binarySearchList.get(mid) > wordFind){
				return binarySearchFindWord2(binarySearchList, l, mid -1, wordFind);
			
			}else{
				return binarySearchFindWord2(binarySearchList, mid + 1, r, wordFind);
			}
			
			
		}
		return -1;
		
	}
}
