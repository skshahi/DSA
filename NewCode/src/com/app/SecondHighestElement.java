package com.app;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SecondHighestElement {

	public static void main(String[] args) {
		int[] arr= {5,9,11,2,8,21,1};
		List<Integer> list = Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

		Integer integer = list.stream().skip(1).findFirst().get();
		System.out.println(integer);
		
		
		
	}

}
