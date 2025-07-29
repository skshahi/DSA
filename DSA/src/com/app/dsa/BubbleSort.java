package com.app.dsa;

public class BubbleSort {

	public static void main(String[] args) {
		int arr[]= {13,2,16,8,4,6,84,9,8};
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
		for(int i:arr)
		{
			System.out.println(i);
		}

	}

}
