package day01_basic;

import java.util.Arrays;

public class ArrayTest3 {

    public static void main(String[] args) {
        int[] aClass = {100, 90, 75};  //  A班
        int[] bClass = {90, 95, 81};  //  B班
        //  試問哪一個班級平均分數最高
        double aAvg = getAvg(aClass);
        double bAvg = getAvg(bClass);
        System.out.printf("A班平均: %.1f\n",aAvg);
        System.out.printf("B班平均: %.1f\n",bAvg);
        System.out.println(aAvg > bAvg ? "A班平均高" : "B班平均高");
    }
        
    public static int getSum(int[] scores) {    //  快捷鍵打p
        int sum = 0;
        for (int x : scores) {
            sum += x;
        }
        return sum;
    }
       
    public static double getAvg(int[] scores) {    //  快捷鍵打p
        int sum = getSum(scores);
        double avg = (double)sum / scores.length;
        return avg ;
    }
}
