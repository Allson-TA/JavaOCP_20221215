package day15_map;

import java.nio.file.DirectoryStream.Filter;
import java.text.Collator;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class GroupByMap3 {

	public static void main(String[] args) {
		
		List<Integer> scores = Arrays.asList(95,47,86,73,32);
		System.out.println(scores);
		
		//	算出及格=3,不及格=2
		Map<String, Long> ss = scores.stream().collect(
				Collectors.groupingBy(score -> score>=60 ? "及格":"不及格",Collectors.counting())
		);
		System.out.println(ss);	
				
		Map<String, List<Integer>> ss2 = scores.stream().collect(
						Collectors.groupingBy(
						score -> score>=60 ? "及格":"不及格",
								Collectors.mapping(score -> score, Collectors.toList()))
		);
		System.out.println(ss2);	

	}

}
