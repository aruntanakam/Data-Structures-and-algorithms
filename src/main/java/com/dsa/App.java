package com.dsa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

import com.dsa.sorting.QuickSort;

/**
 * Hello world!
 *
 */
public class App 
{
	 public static void main( String[] args ) throws IOException {
	        //Scanner s=new Scanner(System.in);
			/*
			 * int n=s.nextInt(); Patterns p=new Patterns(); p.printPattern(n);
			 */
	        System.out.println("Enter array elements to swap:");
	        
	        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	        String[] chars=br.readLine().split(" ");
	        br.close();
	        int[] arr=new int[chars.length];
	        for(int i=0;i<arr.length;i++)
	        {
	        	arr[i]=Integer.parseInt(chars[i]);
	        }
	        System.out.println("Array before sorting:"+Arrays.toString(arr));
			/*
			 * SelectionSort selectionSort=new SelectionSort(); selectionSort.sort(arr);
			 * System.out.println("Array after selection sorting:"+Arrays.toString(arr));
			 */
			/*
			 * BubbleSort bubbleSort=new BubbleSort(); bubbleSort.sort(arr);
			 * System.out.println("Array after bubble sorting:"+Arrays.toString(arr));
			 */
			/*
			 * InsertionSort insertSort=new InsertionSort(); insertSort.sort(arr);
			 * System.out.println("Array after insertion sorting:"+Arrays.toString(arr));
			 */
	       /*MergeSort mergeSort=new MergeSort();
	       mergeSort.sort(arr);
	       System.out.println("Array after merge sorting:"+Arrays.toString(arr));
	 */
	        QuickSort quickSort=new QuickSort();
		       quickSort.sort(arr);
		       System.out.println("Array after quick sorting:"+Arrays.toString(arr));
}
}
