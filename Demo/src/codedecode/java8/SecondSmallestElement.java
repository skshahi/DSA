package codedecode.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SecondSmallestElement {

	public static void main(String[] args) {
		
		//find sencond smallest number in array
	/*	int array[]={4,5,6,1,3,8,7,9,7,9,7,6,5,1,3,1,5,6};
	int secondSmallestNo = Arrays.stream(array).distinct().sorted().skip(1)
		.findFirst().orElseThrow(()->new IllegalArgumentException("No Value Present"));
	System.out.println(secondSmallestNo);*/
		
		//find common number between two array
		int arr1[]={1,4,5,6,2,7};
		int arr2[]={2,4,3,6,1,5};
		List<Integer> collect = Arrays.stream(arr1).
				filter(num1->Arrays.stream(arr2).anyMatch(num2->num1==num2))
				.boxed().collect(Collectors.toList());
		System.out.println("Common Array:"+collect);
		
		//Reverse the array in-place (means without creating new array)
		/*
		 * int arr1[]={1,4,5,6,2,7};
		 * 
		 * System.out.println("Oiginal Array:"+Arrays.toString(arr1));
		 * IntStream.range(0, arr1.length/2).forEach(i->{ int temp=arr1[i];
		 * arr1[i]=arr1[arr1.length-i-1]; arr1[arr1.length-i-1]=temp;
		 * 
		 * }); for(int i:arr1) { System.out.print(i+" "); }
		 */
		
		//find max length of string array
//		String str[]={"sonu","atul","vivaan"};
//		int asInt = Arrays.stream(str).mapToInt(st->st.length()).max().getAsInt();
//		System.out.println(asInt);

	}

}
