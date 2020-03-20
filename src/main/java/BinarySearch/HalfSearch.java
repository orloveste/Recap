package BinarySearch;

import java.util.Scanner;

public class HalfSearch {
    public static int binarySearch(int arr[], int low, int high, int key)
    {
        int mid = (low + high)/2;
        while( low <= high )
        {
            if ( arr[mid] < key )
            {
                low = mid + 1;
            }
            else if ( arr[mid] == key )
            {
                return mid;
            }else
            {
                high = mid - 1;
            }
            mid = (low + high)/2;
        }
        return -1;
    }
    public static void main(String args[])
    {
        int arr[] = {33,10,18,12,2,3,19,20,25,28,48,55,62,70};
        Scanner reader = new Scanner(System.in);
        int key;
        System.out.print("Enter your key: ");
        key = reader.nextInt();
        int n = arr.length -1;
        int index = binarySearch(arr,0, n, key);

        System.out.println("The unsorted array is: ");
        for(int i=0; i < n ;i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nElement to be searched: "+ key);

        System.out.println("Sorted array: ");
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length -1 -i; j++){
                if (arr[j] > arr[j+1]){
                    n = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]=n;
                }
            }
        }
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+ " ");
        } //todo search in sorted array workablabblable
        System.out.println();
        if (index == -1)
            System.out.println("Unfortunately the Element is not found!");
        else
            System.out.println("The Element is found at the index: "+index);
    }
}
