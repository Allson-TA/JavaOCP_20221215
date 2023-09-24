package day15_map;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupByMap {

	public static void main(String[] args) {
		
		//	Apple*3 , banana*2 , papaya*1 , orange*1
		
		List<String> fruits = Arrays.asList("apple", "papaya", "apple", "banana", "banana", "apple", "orange");
		System.out.println(fruits);
		
		//	分類
		// output: apple=3, banana=2, orange=1, papaya=1
		
		Map<String, Long> result = 	fruits.stream().collect(
				//	Collectors.groupingBy(key -> key,Collectors.counting())
				//	groupBy群組，Function.identity()每一個key值，透過Collectors.counting()相加起來
				Collectors.groupingBy(Function.identity(),Collectors.counting())
		);
		System.out.println(result);
		
		

	}

}
