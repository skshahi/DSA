package com.app.dsa;

public class QuickSort {

	public static void main(String[] args) {
		int arr[]= {13,2,16,0,8,4,6,84,9,8};
		quickSort(arr,0,arr.length-1);
		
		for(int a:arr)
		{
			System.out.println(a);
			
		}
		

	}

	private static void quickSort(int[] arr, int low, int high) {
		
		if(low<high)
		{
			int pivot=partition(arr,low,high);
			quickSort(arr, low, pivot-1);

			quickSort(arr, pivot+1, high);
		}
		
	}

	private static int partition(int[] arr, int low, int high) {
		int pivot=arr[high];
		int i=low-1;
		for(int j=low;j<high;j++)
		{
			if(arr[j]<pivot)
			{
				i++;
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				
			}
		}
		int temp=arr[i+1];
		arr[i+1]=arr[high];
		arr[high]=temp;
		return i+1;
	}

}
