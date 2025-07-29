package com.app.dsa;

public class SearchDemo {

	public static void main(String[] args) {
		int arr[]= {4,7,8,8,9,10,14,15,16};
		int target=10;
		int val=linearSearch(arr,target);
		System.out.println(val);
		
		int binarySearchValue=binarySearch(arr,target);
		System.out.println(binarySearchValue);
		
		int binarySearchValueRecursive=binarySearchRecursive(arr,8,0,arr.length-1);;
		System.out.println(binarySearchValueRecursive);

	}

	private static int binarySearchRecursive(int[] arr, int target, int i, int j) {
		if(i<=j)
		{
			int mid=(i+j)/2;
			if(arr[mid]==target)
			{
				return mid;
			}
			else if(arr[mid]<target)
			{
				return binarySearchRecursive(arr, target, mid+1, j);
			}else {
				return binarySearchRecursive(arr, target, i, mid-1);
				
			}
			
			
		}
		return -1;
	}

	private static int binarySearch(int[] arr, int target) {
		int low=0;
		int high=arr.length-1;
		int mid=0;
		while(low<=high)
		{
			 mid=(low+high)/2;
			 if(arr[mid]==target)
			 {
				 return mid;
			 }else if(arr[mid]>target)
			 {
				 high=mid-1;
			 }else {
				 low=mid+1;
			 }
		}
		
		return -1;
	}

	private static  int linearSearch(int[] arr, int target) {
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==target)
			{
				return i;
			}
		}
		return -1;
		
	}

}
