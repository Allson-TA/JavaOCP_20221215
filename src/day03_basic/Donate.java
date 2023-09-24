package day03_basic;

// 捐款程式
public class Donate {
    static int total; // 總捐款金額
    int cash; // 紀錄每個捐款金額
    String name; // 捐款者姓名
    
    void submit(int amount) { // submit-->提交
        cash = amount; // 紀錄捐款金額
        total = total + amount; // 累計捐款金額
    }
}