package br.com.example.howto;

import java.util.ArrayList;
import java.util.Collections;

public class BinarySearchExample {

	public static void main(String[] args) {
        // an ArrayList of elements
        ArrayList listToBeSearched = new ArrayList();
 
        // Add elements to the Arraylist
        listToBeSearched.add("4");
        listToBeSearched.add("1");
        listToBeSearched.add("3");
        listToBeSearched.add("7");
        listToBeSearched.add("1");
        listToBeSearched.add("6");
        listToBeSearched.add("2");
        listToBeSearched.add("5");
 
        // As binary search is performed on a sorted list, listToBeSearched is
        // required to be sorted first before start searching.
        Collections.sort(listToBeSearched);
 
        // See the sorted list in the console
        System.out.println("Sorted List : " + listToBeSearched);
         
        // Search an element from the list using binarySearch method of java.util.Collections class
        int index = Collections.binarySearch(listToBeSearched,"1");
        
        listToBeSearched.remove(index);
        
        System.out.println("Element position found in the list is " + index);
        
        System.out.println("Sorted List : " + listToBeSearched);
 
    }
}
