package day14_map;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapDemo4 {

	public static void main(String[] args) {
		
		Map<String, Integer> scores = new LinkedHashMap<>();
		scores.put("Jojn",85);
		scores.put("Mary",95);
		scores.put("Alen",65);
		System.out.println(scores);
		
		//	最高分?
		int max = scores.values().stream().mapToInt(Integer::intValue).max().getAsInt();
		//	max可能是空的 要取得int值用.getAsInt();
		System.out.println(max);
		
		// 誰最高分?
		  scores.entrySet()
          .stream()
          .filter(entry -> entry.getValue() == max)
          .forEach(entry -> System.out.println(entry.getKey()));

	}

	//	entrySet 一次帶 key value
}
