package com.dsa.sorting;

public class QuickSort {
	
	
	public void quickSort(int[] arr,int low,int high)
	{
		if(low>=high)
		{
			return;
		}
		int pi=partition(arr,low,high);
		quickSort(arr,low,pi-1);
		quickSort(arr,pi+1,high);
	}
	
	public void swap(int[] arr,int i ,int j)
	{
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	
	public int partition(int[] arr,int low,int high)
	{
		int pivot=arr[low];
		int i=low;
		int j=high;
		while(i<j)
		{
			while(i<high && arr[i]<=pivot)
			{
				i++;
			}
			while(j>low && arr[j]>pivot)
			{
				j--;
			}
			if(i<j)
			{
				swap(arr,i,j);
			}
		}
		
		swap(arr,low,j);
		return j;
	}
	
	public void sort(int[]  arr)
	{
		quickSort(arr, 0, arr.length-1);
	}

}