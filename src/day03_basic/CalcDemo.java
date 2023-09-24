package day03_basic;  // 套件宣告，指定此類別所屬的套件

public class CalcDemo {  // 宣告一個公開的類別 CalcDemo
    
    public static void main(String[] args) {  // 宣告一個公開的靜態方法 main，傳入一個字串陣列參數 args
        
        int     area = Calc.rect(10,20);    // 宣告一個整數型別的變數 area，並指定其值為呼叫 Calc 類別的 rect 方法，計算矩形的面積，長為 10，寬為 20
        double area2 = Calc.circle(5);  // 宣告一個 double 型別的變數 area2，並指定其值為呼叫 Calc 類別的 circle 方法，計算圓形的面積，半徑為 5
        double bmiValue = Calc.bmi(170.0,60.0); // 宣告一個 double 型別的變數 bmiValue，並指定其值為呼叫 Calc 類別的 bmi 方法，計算 BMI 值，身高為 170.0 公分，體重為 60.0 公斤
        
        System.out.println(area);  // 印出 area 變數的值到螢幕上
        System.out.println(area2);  // 印出 area2 變數的值到螢幕上
        System.out.println(bmiValue);  // 印出 bmiValue 變數的值到螢幕上
        
    }
}
