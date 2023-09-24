package day01_basic;

import java.util.Arrays;

/* GitHub : 
a0968555221@gmail.com
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
https://github.com/Allson-TA/JavaOCP_20221215.git
*/

public class ArrayTest1 {
    public static void main(String[] args) {
        int[] scores = {100, 85, 74};
               // 位置:  0    1   2
        System.out.println(scores[0]);
        System.out.println(scores[1]);
        System.out.println(scores[2]);
        System.out.println(scores.length);
        //	假如 scores 是一個包含 10 個元素的整數陣列，那麼執行這行程式碼會印出 10。這行程式碼可以用來檢查 scores 陣列中元素的個數
        //	利用 for-loop 印出陣列元素內容
        for(int i=0;i<scores.length;i++) {
            System.out.println(scores[i]);
        }
        // 利用 for-each 印出列元素內容
        for(int x : scores) {
            System.out.println(x);
        }
        
        Arrays.stream(scores).forEach(System.out::println);
    }
} 