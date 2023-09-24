package day13_list;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {

	public static void main(String[] args) {
		
		Queue<String> names = new LinkedList<>();
		
		//	佇列資料叫 offer -->等同於 add 
		names.offer("John");
		names.offer("Mary");
		names.offer("Bob");
		
		System.out.println(names);
		
		while (!names.isEmpty()) {	//	不是空的，代表裡面有資料
			String name = names.poll();	//	將name取出
			System.out.println("得到"+names);
			System.out.println("names"+names);
			
			/*
			 	[John, Mary, Bob]
				得到[Mary, Bob]
				names[Mary, Bob]
				得到[Bob]
				names[Bob]
				得到[]
				names[]
			 */
		}
		
	}

}
