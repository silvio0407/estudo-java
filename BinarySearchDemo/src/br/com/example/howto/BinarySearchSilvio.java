package br.com.example.howto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchSilvio {

	private final static int NOT_FOUND = -1;
	
	public static void main(String[] args) {
		
		List<String> binarySearchList = new ArrayList<String>();
		
		binarySearchList.add("E");
		binarySearchList.add("G");
		binarySearchList.add("D");
		binarySearchList.add("J");
		binarySearchList.add("K");
		binarySearchList.add("W");
		binarySearchList.add("C");
		binarySearchList.add("P");
		
		Collections.sort(binarySearchList);
		
		int value = binarySearchFindWord(binarySearchList, "p".toUpperCase());
		
		if (value == -1) {
            System.out.println("Search value not found");
        } else {
            System.out.println("Search value position: " + value);
        }
		
	}

	private static int binarySearchFindWord(List<String> binarySearchList, String wordFind) {
		
		int low = 0;
		int high = binarySearchList.size() - 1;
		int mid = (low + high) / 2;
		
		while(low <= high && !binarySearchList.get(mid).equalsIgnoreCase(wordFind)){
			
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
	
	private static int binary(List<String> binaryList, String wordFind) {
		
		int low = 0;
		int high = binaryList.size()-1;
		int mid = (low + high) / 2;
		
		while(low <= high && !binaryList.get(mid).equalsIgnoreCase(wordFind)) {
			
			if(binaryList.get(mid).compareTo(wordFind) < 0) {
				low = low + 1;
			}else {
				high = high -1;
			}
			
			mid = (high + low) /2;
			
			if(low > high)
				mid = NOT_FOUND;
		}
		return mid;
		
	}
}
