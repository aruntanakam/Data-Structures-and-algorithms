package com.dsa.sorting;

public class SelectionSort {
	
	public int minIndex(int[] arr,int start,int end)
	{
		int min=start;
		for(int i=start;i<=end;i++)
		{
			if(arr[i]<arr[min])
			{
				min=i;
			}
		}
		return min;
	}
	
	public void swap(int[] arr,int a,int b)
	{
		int temp=arr[b];
		arr[b]=arr[a];
		arr[a]=temp;
	}
	
	public void sort(int[] arr)
	{
		int n=arr.length;		
		for(int i=0;i<=n-2;i++)
		{
		   swap(arr,i,minIndex(arr,i,n-1));
		}
	}

}
