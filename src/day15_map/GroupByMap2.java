package day15_map;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByMap2 {
    public static void main(String[] args) {
        List<String> scores = Arrays.asList("A", "A", "B", "E", "D", "C", "C", "A", "B", "B", "E");
        System.out.println("全班成績等第: " + scores);
        //	請寫出每個等第有幾人 ?
        //  寫出每個等級有幾人
    	//	使用Long原因 : 計數的結果是每個分組中元素的個數，因此需要使用長整數型別來表示計數，且counting會回傳Long
        Map<String, Long> result = scores.stream().collect(
                Collectors.groupingBy(key -> getLevelName(key), Collectors.counting())
        );
        System.out.println(result);
    }
    
    public static String getLevelName(String key) {
        switch (key) {
            case "A":
                return "甲";
            case "B":
                return "乙";
            case "C":
                return "丙";
            case "D":
                return "丁";
            default:
                return "戊";
        }
    }
}
	