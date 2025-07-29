package com.app.dsa;

public class MergeSort {

	private static void mergeSort(int[] arr, int low, int high) {
		
		if(low<high)
		{
			int mid=(low+high)/2;
			mergeSort(arr, low, mid);
			mergeSort(arr,mid+1,high);
			mergeArr(arr,low,mid,high);
			
		}
		
	}

	private static void mergeArr(int[] arr, int low, int mid, int high) {
		int n1=mid-low+1;
		int n2=high-mid;
		int lowArr[]=new int[n1];
		int highArr[]=new int[n2];
		for(int i=0;i<n1;i++)
		{
			lowArr[i]=arr[low+i];
		}
		for(int i=0;i<n2;i++)
		{
			highArr[i]=arr[mid+1+i];
		}
		int i=0;
		int j=0;
		int k=low;
		//merging  
		while(i<n1 && j<n2)
		{
			if(lowArr[i]<highArr[j])
			{
				arr[k]=lowArr[i];
				i++;
			}
			else {
				arr[k]=highArr[j];
				j++;
			}
			k++;
		}
		
		while(i<n1)
		{
			arr[k]=lowArr[i];
			i++;
			k++;
			
		}
		while(j<n2)
		{
			arr[k]=highArr[j];
			j++;
			k++;
			
		}
		
	}

	public static void main(String[] args) {
		int arr[]= {13,2,16,0,8,4,6,84,9,8};
		
		mergeSort(arr,0,arr.length-1);
		for(int a:arr)
		{
			System.out.println(a);
		}
		

	}


}
