package com.gvacharya.streamapi.entity;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class MainStudent {
	
	public static void main(String[] args) {
		Student[] studentArray = new Student[5];
		studentArray[0] = new Student(1,"Vijay",20);
		studentArray[1] = new Student(2,"Aniket",21);
		studentArray[2] = new Student(3,"Ashish",22);
		studentArray[3] = new Student(4,"Taha",23);
		studentArray[4] = new Student(5,"Shon",22);
		
		Stream<Student> studentStream = Arrays.stream(studentArray);	
//		studentStream
//		.map(obj->obj.getName())
//		.map(Student::getName)
//		.filter(str->str.charAt(0)=='A')
//		.map(Student::getAge)
//		.distinct()
//		.filter(obj->obj.getAge()>20)
//		.filter(e->e.getName().charAt(3)=='a')
//		.forEach(System.out::println);
		
		String[] names=studentStream
		.filter(e->e.getName().charAt(3)!='a')
		.map(Student::getName)
		.sorted(Comparator.reverseOrder())
		.toArray(String[]::new);
		
		System.out.println(Arrays.toString(names));
		studentStream.close();
	}

}
