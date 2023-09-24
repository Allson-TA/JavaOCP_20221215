package day12_set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class DemoSet2 {

	public static void main(String[] args) {
		Set set = new LinkedHashSet<>();	//	按照順序
		set.add("國文");	//	String
		set.add(100);	//	Integer
		set.add("數學");	//	String
		set.add(null);	//	Integer
		set.add("英文");	//	String
		set.add(null);	//	空值
		set.add(null);	//	空值
		set.add(80);	//	Integer
		System.out.println(set); 
		
		//	利用Iterator來走訪每個元素，也可以移除不要的元素
		Iterator iter = set.iterator();	//	從集合set中提取Iterator物件
		
		while(iter.hasNext()) {	//	是否有元素
			Object item2 = iter.next();	//	取得元素
			System.out.println(item2);
			if(item2 == null) {	//	如果有null
				iter.remove();	//	移除此元素
			}
			
		}
		System.out.println("移除null之後"+set);
		
	}

}
