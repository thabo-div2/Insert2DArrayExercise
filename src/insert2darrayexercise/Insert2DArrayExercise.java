/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package insert2darrayexercise;

import java.util.*;

/**
 *
 * @author Thabo Setsubi ST10445734 thabosetsubi3@gmail.com
 */
public class Insert2DArrayExercise {

    
    public static void main(String[] args) {
        int nums[][] = {};
        int nums2[][] = {};
        int r;
        int c;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter how many rows: ");
        r = scan.nextInt();
        System.out.println("Enter hoe many columns: ");
        c = scan.nextInt();
        nums = new int[r][c];
        
        nums = insertArray(nums, r, c);
        insertionSort(nums);
    }
    
    static int[][] insertArray(int nums[][], int r, int c)
    {
        Scanner scan = new Scanner(System.in);
        int num;
        for (int i = 0; i < r; i++) 
        {
            for(int j = 0; j < c; j++) 
            {
                System.out.println("Enter " + j + " number into the " + i + "column:");
                num = scan.nextInt();
                nums[i][j]= num;
            }
        }
        
        printArray(nums);
        return nums;
    }
    
    static void insertionSort(int nums[][]) 
    {
        int k, key; // variables to store current number and control varible
        int keyRow[]; // to check the current array so that we can sort that arrays elements
        
        for (int i = 0; i < nums.length; i++) // loop through the 2d array
        {
            keyRow = nums[i]; // store the current array.
            for(int j = 1; j < keyRow.length; j++) // insertion sort the array 
            {
                key = keyRow[j]; 
                k = j - 1;
                while(k >= 0 && keyRow[k] > key) // check to see if the current array is greater than the next element
                {
                    keyRow[k + 1] = keyRow[k]; //swap
                    k--;
                }
                keyRow[k+1] = key;
            }
        }
        printArray(nums);
    }
    
    static void printArray(int nums[][])
    {
        int keyRow[] = {};
        for(int i = 0; i < nums.length; i++)
        {
            
            for(int j = 0; j < nums.length; j++)
            {
                System.out.print(nums[i][j]+ " ");
                
            }
        }
        System.out.println();
    }
    //--------------------------- End Of File --------------------------------//
}
