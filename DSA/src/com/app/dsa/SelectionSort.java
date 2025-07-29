package com.app.dsa;

public class SelectionSort {

	public static void main(String[] args) {
		int arr[]= {13,2,16,8,4,6,84,9,8};
		int len=arr.length;
		int temp=0;
		int minIndex=0;
		for(int i=0;i<len-1;i++)
		{
			minIndex=i;
			for(int j=i;j<len;j++)
			{
				if(arr[minIndex]>arr[j])
				{
					minIndex=j;
				}		
				 				
			}
			temp=arr[minIndex];
			arr[minIndex]=arr[i];
			arr[i]=temp;
		}
		
		for(int a:arr)
		{
			System.out.println(a);
		}

	}

}
