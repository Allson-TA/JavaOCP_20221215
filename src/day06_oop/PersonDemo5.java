package day06_oop;

import java.util.Arrays;

public class PersonDemo5 {

	public static void main(String[] args) {
		Student s1 = new Student("John",18,90);
		Student s2 = new Student("Mary",18,55);
		Student s3 = new Student("Helen",19,45);
		Student s4 = new Student("Jane",17,80);
		Student s5 = new Student("Kitty",18,100);
		
		Student[] students = {s1,s2,s3,s4,s5};
		
		//	請用Java Stream印出及格學生的成績(只要印出名字就好)
		
		for(Student student : students) {
			if(student.getSocre()>=60) {		//	過濾條件
				System.out.println(student.getName());
			}
			
		}
		
		Arrays.stream(students).filter(student -> student.getSocre() >= 60).forEach(student -> System.out.println(student.getName()));
	

	}

}
