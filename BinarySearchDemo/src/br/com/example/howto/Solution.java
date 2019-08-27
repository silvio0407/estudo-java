package br.com.example.howto;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.stream.Collectors;

public class Solution {

public static final void main(String[] args){
        
        int[] A = {1,1,2,2,3,4,1};
        
        System.out.println("Valor faltante: " + solution(A));
    }
    
    public static int solution(int[] A) {
        
    	int number=1;
    	int size = A.length;
    	
    	HashSet<Integer> missingInteger = new HashSet<>();
    	
    	Map<Integer, Integer> mapInts = new HashMap<Integer, Integer>();
    	
    	for(int i=0; i< size; i++) {
    		missingInteger.add(A[i]);
    		if(!mapInts.containsKey(A[i])) {
    			mapInts.put(A[i], 1);
    		}else {
    			mapInts.put(A[i], mapInts.get(A[i]) + 1);
    		}
    	}

    	mapInts.entrySet().forEach(c -> {
    		System.out.println(c.getKey() + " - " + c.getValue());
    	});
       
    	while(missingInteger.contains(number)) {
    		number++;
    	}
        
        
        return number;
    }
    
   
    
 
}
