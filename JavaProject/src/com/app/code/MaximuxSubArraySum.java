package com.app.code;

public class MaximuxSubArraySum {

	public static void main(String[] args) {
		int arr[]= {7,8,-4,1,5,-2,3,-9};
		
		int res=0;
		for(int i=0;i<arr.length;i++)
		{
			int temp=0;
			for(int  j=i;j<arr.length;j++)
			{
				temp=temp+arr[j];
				res=Math.max(res, temp);
			}
		}
      System.out.println("Max Sum:"+res);
	}

}
