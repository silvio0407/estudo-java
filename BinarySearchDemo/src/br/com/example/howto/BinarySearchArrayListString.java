package br.com.example.howto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchArrayListString {

	private final static int NOT_FOUND = -1;

    public static void main(String[] args) {

        List<String> integerList = new ArrayList<String>();
        integerList.add("Z");
        integerList.add("W");
        integerList.add("E");
        integerList.add("D");
        integerList.add("Z");
        integerList.add("A");
        integerList.add("V");
        integerList.add("W");

        Collections.sort(integerList);

        int value = binarySearch(integerList, "w".toUpperCase());

        if (value == -1) {
            System.out.println("Search value not found");
        } else {
            System.out.println("Search value position: " + value);
        }
    }
    
    /**
     * @param number
     * @param searchValue
     * @return
     */
    public static int binarySearch(List<String> integerList, String searchValue) {

        int low = 0;
        int high = integerList.size() - 1;
        int mid = (low + high) / 2;

        while (low <= high && !integerList.get(mid).equalsIgnoreCase(searchValue)) {

            if (integerList.get(mid).compareTo(searchValue) < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }

            mid = (low + high) / 2;

            if (low > high) {
                mid = NOT_FOUND;
            }

        }
        return mid;

    }
    
}
