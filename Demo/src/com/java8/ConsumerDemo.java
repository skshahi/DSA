package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {
		//Consumer<Integer> c=(i)->System.out.println("Print:"+i);
		//c.accept(15);
		List<Integer> list=Arrays.asList(1,2,3,4,5);
		//list.stream().forEach(c );
		list.stream().forEach((i)->System.out.println("Print:"+i));

	}

}
