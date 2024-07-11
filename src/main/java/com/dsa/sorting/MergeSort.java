package com.dsa.sorting;

public class MergeSort {
	
	public void mergeSort(int[] arr,int low,int high)
	{
		if(low>=high)
			return;
		
		int mid=(low+high)/2;
		mergeSort(arr,low,mid);
		mergeSort(arr,mid+1,high);
		merge(arr,low,mid,high);
	}
	
	public void merge(int[] arr,int low,int mid,int high)
	{
		int[] temp=new int[high+1];
		
		int left=low;
		int right=mid+1;
		
		int k=0;
		while(left<=mid && right<=high)
		{
			if(arr[left]<=arr[right])
			{
				temp[k]=arr[left];
				left++;
				k++;
			}
			else
			{
				temp[k]=arr[right];
				k++;
				right++;
			}
		}
		while(left<=mid)
		{
			temp[k]=arr[left];
			k++;
			left++;
		}
		while(right<=high)
		{
			temp[k]=arr[right];
			k++;
			right++;
		}
		for(int i=low;i<=high;i++)
		{
			arr[i]=temp[i-low];
		}
	}

	public void sort(int[] arr)
	{
		mergeSort(arr,0,arr.length-1);
	}
}
