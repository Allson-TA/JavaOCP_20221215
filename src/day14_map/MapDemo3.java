package day14_map;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapDemo3 {

	public static void main(String[] args) {
		
		Map<String, Double> map = new LinkedHashMap<>();
		map.put("半徑1", 10.5);
		map.put("半徑2", 12.0);
		map.put("半徑3", 7.5);
		System.out.println(map);
		
		//	計算每一個半徑的圓面積
		map.values()	//	Collection<Double>
			.forEach(r->System.out.println(r*r*Math.PI));
		
		//	計算園面積總和
		double sum = (double) map.values().stream().mapToDouble(r ->r*r*Math.PI).sum();
		System.out.printf("%.2f",sum);
	}
	
	/*
	 *map.values()：這部分取得了 map 中所有的 value（值），返回一個 Collection（集合），這個集合包含了 map 中的所有值。
	.stream()：將集合轉換為一個串流（Stream），這是 Java 8 新增的功能，用於支援集合上的操作。
	.mapToDouble(Double::doubleValue)：在這一步中，將集合中的每個值轉換為 double 型別的浮點數。這裡使用了 .mapToDouble 方法，並通過 Double::doubleValue 方法參考來執行轉換。
	.sum()：使用 .sum() 方法對轉換後的浮點數值進行總和計算，這會返回一個總和的浮點數。
	System.out.println(sum)：最後，將計算出的總和輸出到控制台。
	 */
}
