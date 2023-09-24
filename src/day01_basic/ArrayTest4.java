package day01_basic;

import  static day01_basic.ArrayTest3.getAvg;

public class ArrayTest4 {
    public static void main(String[] args) {
        int[] cClass = {89, 91, 69};  // C班
        int[] dClass = {92, 65, 80};  //  D班
        //  試問哪一個班級平均分數最高
        double cAvg = getAvg(cClass);
        double dAvg = getAvg(dClass);
        System.out.printf("C班平均: %.1f\n",cAvg);
        System.out.printf("D班平均: %.1f\n",dAvg);
        System.out.println(cAvg > dAvg ? "C班平均高" : "D班平均高");
    }
}
