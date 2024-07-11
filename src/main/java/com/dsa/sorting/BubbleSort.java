package com.dsa.sorting;

public class BubbleSort {
	
	public void swap(int[]  arr,int i,int j)
	{
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	
	public void sort(int[]  arr)
	{
		int n=arr.length;
		
		
		for(int i=n-1;i>=0;i--)
		{
			boolean swap=false;
			for(int j=0;j<i;j++)
			{
				if(arr[j]>arr[j+1])
				{
				  swap(arr,j,j+1);
				  swap=true;
				}
			}
			if(swap==false)
			{
				break;
			}
			System.out.println("run");
		}
	}

}
