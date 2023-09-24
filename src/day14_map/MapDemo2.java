package day14_map;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo2 {

	public static void main(String[] args) {
		
		Map<String, Integer> employees = new LinkedHashMap<>();
		
		employees.put("John", 55000);
		employees.put("Mary", 85000);
		employees.put("Alen", 60000);
		System.out.println(employees);
	
		//	請計算總分與平均
		
		Collection<Integer> salary = employees.values();
		System.out.println(salary);
		int sum=0;
		for(Integer value:salary) {
			sum += value;
		}
		System.out.println(sum);
		
		//	Java 8
		
		 int sum2 = employees.values()
                 .stream()
                 .mapToInt(Integer::intValue) //.mapToInt(x -> x.intValue())
                 .sum();
		 System.out.println(sum2);
	}

}
