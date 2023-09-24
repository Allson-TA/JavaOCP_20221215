package day04_basic;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
    
    static char [] ttt = {'-', '-', '-', '-', '-', '-', '-', '-', '-'};
    // 用于存储棋盘状态的字符数组，初始值为'-'

    public static void main(String[] args) {
        printTTT();
        // 打印初始的棋盘状态
        while (true) {            
           userPlay();
            // 用户进行下棋
            if(checkWinner()) {
                break; // 有赢家或和局所以跳出循环
            }
            pcPlay();
            // 电脑进行下棋
            if(checkWinner()) {
                break; // 有赢家或和局所以跳出循环
            }
        }
    }
    
    public static boolean checkWinner() {
        int[][] wins = {
            {0, 1, 2}, {3, 4, 5}, {6, 7, 8}, 
            {0, 3, 6}, {1, 4, 7}, {2, 5, 8}, 
            {0, 4, 8}, {2, 4, 6}, 
        };
        // 赢家判断
        for(int i=0;i<wins.length;i++) {
            int sum = ttt[wins[i][0]] + ttt[wins[i][1]] + ttt[wins[i][2]];
            if(sum == 'O'*3) { // 'O' + 'O' + 'O' = 237 
                System.out.println("用户赢了！");
                return true; // 有赢家
            } else if(sum == 'X'*3) { // 'X' + 'X' + 'X' = 264
                System.out.println("电脑赢了！");
                return true; // 有赢家
            }
        }
        // 和局判断
        int total = 0;
        for(int i=0;i<ttt.length;i++) {
            total += ttt[i];
        }
        System.out.println("total = " + total);
        switch (total) {
            case (('O' * 5) + ('X' * 4)):
            case (('O' * 4) + ('X' * 5)):
                return true; // 和局
            default:
                return false; // 没有赢家
        }
    }
    
    public static void userPlay() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("用户请选择(0~8): ");
        int index = scanner.nextInt();
        ttt[index] = 'O';
        // 用户输入选择的位置并将对应位置的棋子设为'O'
        printTTT();
    }
    
    public static void pcPlay() {
        Random random = new Random();
        while (true) {            
            int index = random.nextInt(ttt.length); // 0~8
            if(ttt[index] == '-') {
                System.out.println("电脑请选择(0~8): " + index);
                ttt[index] = 'X';
                break;
            }
        }
        printTTT();
    }
    
    public static void printTTT() {
        for (int i = 0; i < ttt.length; i++) {
            System.out.printf("%c ", ttt[i]);
            if ((i + 1) % 3 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

}