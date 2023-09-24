package day12_set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

//	Set 不可重複元素的集合
public class DemoSet {
	public static void main(String[] args) {
		
		//	若釋放重複元素，則只會出現一遍，其他無視
		//	Set set = new HashSet<>(); //	無排序
		Set set = new LinkedHashSet<>();	//	按照順序
		set.add("國文");	//	String
		set.add(100);	//	Integer
		set.add("數學");	//	String
		set.add(90);	//	Integer
		set.add("英文");	//	String
		set.add(80);	//	Integer
		System.out.println(set); 
		
		// HashSet 無排序 [80, 100, 國文, 英文, 90, 數學] 
		// LinkedHashSet 按照順序 [國文, 100, 數學, 90, 英文, 80]
		
		//	因為是Object陣列 透過for迴圈 取出每個值得元素
		for(Object item : set) {
			System.out.println(item + "," + item.getClass().getTypeName());
		}
		
		//	計算總分
		System.out.println("計算總分");
		int sum = 0;
		for(Object item2 : set) {
			if(item2 instanceof Integer) {	//	判斷item2是否可以instanceof轉型成Integer
				System.out.println(item2);
				sum += (Integer)item2;	//	將 item2 由 Object 型別轉Integer，再由sum進行累加
			}
		}
		System.out.println("總分=" + sum);
			
	}
	
	
}
