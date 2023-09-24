package day06_oop;

import java.util.Arrays;

public class PersonDemo3 {

	public static void main(String[] args) {
		Person p1 = new Person("John",18);
		Person p2 = new Person("Jack",19);
		Person p3 = new Person("Anita",17);
		Person p4 = new Person("Bobo",21);
		Person p5 = new Person("Candy",20);
		
		//	建立Person陣列
		Person[] persons = {p1,p2,p3,p4,p5};
		System.out.println(persons);
		System.out.println(Arrays.toString(persons));	//	呼叫每個物件的persons，會自動跑回圈印出
		
		//	依序印出每一筆紀錄 for-loop (Java 1.0)
		for(int i=0;i<persons.length;i++) {
			System.out.println(persons[i]);
		}
		
		//	依序印出每一筆紀錄 for-each (Java 5.0)
		//	左邊放每個元素的型別還有變數名稱 : 右邊放陣列名稱
		for(Person person : persons) {
			System.out.println(person);
		}
		
		//	依序印出每一筆紀錄 Arrays.stream() (Java 8.0)
		//	(参数) -> { 操作 } 或者方法引用 对象::方法
		Arrays.stream(persons).forEach(person -> System.out.println(person));
		
		//	依序印出每一筆紀錄 Arrays.stream() + :: 方法參考 (Java 8.0) ， 得到什麼就印甚麼
		Arrays.stream(persons).forEach(System.out :: println);
	
	}

}
