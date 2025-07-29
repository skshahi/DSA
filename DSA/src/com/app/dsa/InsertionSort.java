package com.app.dsa;

public class InsertionSort {

	public static void main(String[] args) {
		int arr[]= {13,2,16,8,4,6,84,9,8};
		int key=0;
		//int j=0;
		
		for(int i=1;i<arr.length;i++)
		{
			key=arr[i];
			int j=i-1;
			
			while(j>=0 && arr[j]>key)
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
		}
		
		for(int a:arr)
		{
			System.out.println(a);
		}
		

	}

}
