package com.dsa.sorting;

public class InsertionSort {
	
	public void swap(int[]  arr,int i,int j)
	{
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	
	public void sort(int[]  arr)
	{
		int n=arr.length;
		for(int i=0;i<n;i++)
		{
			int j=i;
			while(j>0 && arr[j-1]>arr[j])
			{
			  swap(arr,j,j-1);
			  j--;
			}
		}
	}

}
