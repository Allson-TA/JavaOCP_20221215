package day03_basic;  // 套件宣告，指定此類別所屬的套件

public class MathDemo {  // 宣告一個公開的類別 MathDemo
    
    public static void main(String[] args) {  // 宣告一個公開的靜態方法 main，傳入一個字串陣列參數 args
        
        double pi = Math.PI;  // 宣告一個 double 型別的變數 pi，並指定其值為 Math 類別的 PI 常數
        System.out.println(pi);  // 印出 pi 變數的值到螢幕上
        
        // 計算 3 的 5 次方
        double result = Math.pow(3, 5);  // 宣告一個 double 型別的變數 result，並指定其值為 Math 類別的 pow 方法，計算 3 的 5 次方
        System.out.println(result);  // 印出 result 變數的值到螢幕上
        
        // 計算兩點 AB 之間的距離
        int x1=10,  y1=20,  x2=25,  y2=50;  // 宣告四個整數型別的變數 x1、y1、x2、y2，並指定其值
        double  dx =  Math.pow(x1-x2,2);  // 宣告一個 double 型別的變數 dx，並指定其值為計算 x1 和 x2 之間的平方差
        double  dy =  Math.pow(y1-y2,2);  // 宣告一個 double 型別的變數 dy，並指定其值為計算 y1 和 y2 之間的平方差
        double  d =  Math.sqrt(dx + dy);  // 宣告一個 double 型別的變數 d，並指定其值為計算 dx 和 dy 之間的平方和的平方根
        //  Math.sqrt -->開根號
        System.out.println(d);  // 印出 d 變數的值到螢幕上
    }
}
