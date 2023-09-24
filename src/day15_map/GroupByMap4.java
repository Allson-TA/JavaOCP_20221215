package day15_map;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupByMap4 {

	public static void main(String[] args) {
		
		List<Integer> nums = new ArrayList<>();
		Random r = new Random();
		for(int i=0;i<10;i++) {
			nums.add(r.nextInt(100)+1);	//	1~100的亂數
		}
		System.out.println("亂數產出: " +nums);
		
		//	算出基數偶數
		Map<String, Long> ss = nums.stream().collect(
				Collectors.groupingBy(
					score -> score % 2 != 0 ? "基數":"偶數", Collectors.counting())
		);
		System.out.println("分類結果: "+ss);	
		
		//	算出基數偶數各有哪些
		Map<String, List<Integer>> ss2 = nums.stream().collect(
				Collectors.groupingBy(
					score -> score % 2 != 0 ? "基數":"偶數",
						Collectors.mapping(Function.identity(), Collectors.toList()))
		);
		System.out.println(ss2);	
	}

}
