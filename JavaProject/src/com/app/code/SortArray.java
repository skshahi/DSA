package com.app.code;

public class SortArray {

	public static void main(String[] args) {
		int arr[]= {5,2,6,4,1,0};
		
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]>arr[i+1])
			{
				  int temp = arr[i];
		            arr[i] = arr[i + 1];
		            arr[i + 1] = temp;
		            i = -1;
			}
		}
		
		for(int i:arr)
		{
			System.out.println(i);
		}

	}

}
