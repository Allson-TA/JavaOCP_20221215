package day01_basic;
//計算 BMI
public class BMITest1 {
    
    public static void main(String[] args) {    //主程式快捷鍵打P
        String name = "John";   //人名
        double height = 170.0;  //身高
        double weight = 60.0;   //體重
        double bmi = weight / Math.pow(height/100, 2);
        System.out.printf("%s BMI: %.2f\n", name,bmi); //印出快捷鍵打sout      
        
        String name2 = "Mary";
        double height2 = 160;
        double weight2 = 55;
        double bmi2 = weight2 / Math.pow(height2/100, 2);
        System.out.printf("%s BMI: %.2f\n", name2,bmi2);
               
    }


     // 建立一個計算 bmi 值的方法並且在計算完畢後會回傳(return) bmi 值
    public static double getBMI(double h, double w) {
        double bmi = w / Math.pow(h/100, 2);
        return bmi;
    }
    
    // 建立一個列印 name 與 bmi 的方法
    public static void print(String name, double bmi) {
        System.out.printf("%s BMI: %.2f\n", name, bmi);
    }
}    

/*
Math.pow(底数x,指数y)
假設
int a=3;    //底數
int b=4;    //指數(次方的意思)
int c =(int) Math.pow(a,b);
System.out.println(c);
意思就是a的值乘上4次(b的int值) = 3*3*3*3=81
*/

/*
%d     十进制整数
%f     十进制浮点数
%o     八进制数
%u     无符号的十进制数
%x     十六进制数
%c     单个字符
%s     字符串
%%     输出%号
Printf是沿用了C语言中的部分输出方式，可以格式化输出
Println & print的用法和作用基本相同，但println的输出結果會换行
*/

/*
程式主要分成三部分：

第一部分宣告了一個類別 BMITest1，並設置了一些註釋。這些註釋可能是作者的備註，也可能是一些 IDE (Integrated Development Environment) 自動生成的註釋，用於說明程式的作用和用途。
第二部分是程式的主體，定義了一個 main() 方法。該方法包含了兩個人的身高和體重，並使用這些值計算了他們的 BMI 值。這裡使用了 Math.pow() 方法計算身高的平方值，並使用 printf() 方法輸出結果。
第三部分是另一個數學運算，它使用 Math.pow() 方法計算 a 的 b 次方並將結果轉換為整數，然後使用 System.out.println() 方法將結果輸出到控制台。
*/