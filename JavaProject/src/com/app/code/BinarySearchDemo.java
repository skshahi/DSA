package com.app.code;

public class BinarySearchDemo {
	
	public static  int binarySearch(int arr[],int value)
	{
		
		int low=0;
		int high=arr.length-1;
		int mid=(low+high)/2;
		while(low<=high)
		{
			if(arr[mid]==value)
			{
				return mid;
			}else if(value>arr[mid])
			{
				low=mid+1;
			}else {
				high=mid-1;
			}
			mid=(low+high)/2;
		}
		return -1;
	}

	public static void main(String[] args) {
		
		int arr[]= {1,3,4,5,6,7,8,9};
		int binarySearch = binarySearch(arr, 10);
		System.out.println(binarySearch);
		

	}

}
