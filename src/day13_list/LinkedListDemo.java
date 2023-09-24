package day13_list;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListDemo {

	//	佇列的應用，可重複
	public static void main(String[] args) {
		
		List<String> list = new LinkedList<>();
		list.add("John");	//	0
		list.add("Mary");	//	1
		list.add(0/*調整index順位*/,"Bob");	//	2
		list.add("John");	//	3 (List中允許資料重複)
		System.out.println(list);	
		System.out.println(list.size());
		System.out.println(list.get(1));
		
		//	ListIterator巡訪器
		ListIterator<String> iter = list.listIterator();
		while(iter.hasNext()) {
			int index = iter.nextIndex();
			String name = iter.next();
			System.out.printf("index: %d, value: %s\n",index,name);
		}
			/*
				index: 0, value: Bob
				index: 1, value: John
				index: 2, value: Mary
			*/
			
			while(iter.hasPrevious()) {
				int index2 = iter.previousIndex();
				String name2 = iter.previous();
				System.out.printf("index: %d, value: %s\n",index2,name2);
			
			/*
			 	index: 2, value: Mary
				index: 1, value: John
				index: 0, value: Bob
			*/
				
			//	Iterator 往前
			//	Previous 往後
		}
		
	}

}
