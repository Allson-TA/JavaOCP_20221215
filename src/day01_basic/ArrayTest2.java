package day01_basic;

import java.util.Arrays;    //旁邊空白處按下右鍵 Fix imports就會產出此行

public class ArrayTest2 {
    public static void main(String[] args) {
        int[] scores = {100,85,74};
        System.out.println(scores);
        System.out.println(Arrays.toString(scores));
        // 想要計算總分 = ?
        int sum = 0;
        for(int x : scores) {
            sum += x;   // sum = sum + x;
        }
        System.out.println(sum);
        // 印出平均
        double avg = (double)sum / scores.length;
        System.out.println(avg);
    }   
}

/*
[I@762efe5d
[100, 85, 74]
259
86.0 -->正常應該要是86.3333
但因為分母scores的值是int
所以產生出來的值會是int整數
分母 or 分子 都是double才會是86.333333
*/
