package day14_map;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo1 {

	public static void main(String[] args) {
		
		//	Map是一種Key / Value得集合
		//	Key不可重複，Value可以重複|
		Map<String, Integer> exams = new LinkedHashMap<>();
		
		//	放資料模式
		exams.put("國文", 100);
		exams.put("數學", 75);
		exams.put("英文", 100);
		
		System.out.println(exams);
		
		//	單獨把所有的Key取出
		Set<String> keys = exams.keySet();
		System.out.println(keys);
		
		//	單獨把所有內容取出
		Collection<Integer> values = exams.values();
		System.out.println(values);
		
		//	根據Key取Value
		System.out.println(exams.get("英文"));
		System.out.println(exams.get("數學"));
		
		//	改資料put 1:數學改成95分
		exams.put("數學", 95);
		System.out.println(exams);
		
		//	改資料replace 2:數學改成95分
		exams.replace("數學", 200);
		System.out.println(exams);
		
		//	刪除數學
		exams.remove("數學"); 
		System.out.println(exams);
	}

}
