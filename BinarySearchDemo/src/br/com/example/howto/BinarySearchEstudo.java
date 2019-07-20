package br.com.example.howto;

public class BinarySearchEstudo {

	// Returns index of x if it is present in arr[l.. 
    // r], else return -1 
    int binarySearch(int arr[], int l, int r, int valorProcurado) 
    { 
        if (r >= l) { 
            int mid = l + (r - l) / 2; 
  
            // If the element is present at the 
            // middle itself 
            if (arr[mid] == valorProcurado) 
                return mid; 
  
            // If element is smaller than mid, then 
            // it can only be present in left subarray 
            if (arr[mid] > valorProcurado) 
                return binarySearch(arr, l, mid - 1, valorProcurado); 
  
            // Else the element can only be present 
            // in right subarray 
            return binarySearch(arr, mid + 1, r, valorProcurado); 
        } 
  
        // We reach here when element is not present 
        // in array 
        return -1; 
    } 
  
    // Driver method to test above 
    public static void main(String args[]) 
    { 
    	BinarySearchEstudo ob = new BinarySearchEstudo(); 
        int arr[] = { 2, 3, 4, 10, 40 }; 
        int n = arr.length; 
        int valorProcurado = 40; 
        int result = ob.binarySearch(arr, 0, n - 1, valorProcurado); 
        if (result == -1) 
            System.out.println("Element not present"); 
        else
            System.out.println("Element found at index " + result); 
    } 
}
