package com.app.code;

public class FindFirstMissingNumberInArray {

	public static void main(String[] args) {
		int arr[]= {6,2,1,4};
		for(int i=1;i<arr.length;i++)
		{
			boolean flag=false;
			for(int j=0;j<arr.length;j++)
			{
				if(arr[j]==i)
				{
					flag=true;
				}
				
			}
			if(flag==false)
			{
				System.out.println("missing :"+i);
				break;
			}
			
		}

	}

}
