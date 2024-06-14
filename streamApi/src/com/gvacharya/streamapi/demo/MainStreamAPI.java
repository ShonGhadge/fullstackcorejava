package com.gvacharya.streamapi.demo;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class MainStreamAPI {
	public static void main(String[] args) {
		int[] intArray = {4, 3, 2, 6, 7, 5, 9, 1, 2, 4};
		
		IntStream intStream = Arrays.stream(intArray);
		
		OptionalInt min= intStream
		.filter(no-> no>1)
		.sorted()
		.peek(no->System.out.println(no))
		.map(no->no+2)
		.distinct()
		.filter(no-> no>5&&no<10)
//		.forEach(no->System.out.println(no));
//		.forEach(System.out::println);
		.min();
		if(!min.isEmpty())
		System.out.println(min.getAsInt());
		
		intStream.close();
	}

}
