/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selectionsort;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author d7om7
 */
public class SelectionSort {

    
    public static int[] doSelectionSort(int[] arr){
         
        for (int i = 0; i < arr.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[index])
                    index = j;
      
            int smallerNumber = arr[index]; 
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
        return arr;
    }
     
    public static int[] doSort(int[] arr){
        Arrays.sort(arr);
        return arr;
    }
    
    public static void main(String a[]){
         
        int[] arr1 = {13,34,2,56,2,14,27,67,88,42};
        int[] arr2 = doSelectionSort(arr1);
        int[] arr3 = doSort(arr1);
        
        for(int i:arr2){
            System.out.print(i);
            System.out.print(", ");
        }
        
        System.out.println("\n================");
        
        for(int i:arr3){
            System.out.print(i);
            System.out.print(", ");
        }
    }
    
}
