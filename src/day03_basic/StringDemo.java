package day03_basic; 
	// 設定 package 名稱為 day03_basic

public class StringDemo {  
	// 建立 public 類別 StringDemo

    public static void main(String[] args) {  
    	// main 方法，程式的進入點

        /*
        char c1 = 'A';  
        // 宣告一個 char 變數 c1，並賦值 'A'
        char c2 = 'A'; 
         // 宣告一個 char 變數 c2，並賦值 'A'
        int x = 65; 
         // 宣告一個 int 變數 x，並賦值 65（ASCII 碼的 'A'）
        System.out.println(c1 == c2); 
         // 判斷 c1 與 c2 是否相等，並印出結果（true）
        System.out.println(c1 == x);  
        // 判斷 c1 與 x 是否相等，並印出結果（true）
        // 大A = ASCII Code 65
        */

        String s1 = new String("Java"); 
        // 宣告一個 String 物件 s1，並使用 new 關鍵字創建一個新的字串物件 "Java"
        String s2 = new String("Java"); 
        // 宣告一個 String 物件 s2，並使用 new 關鍵字創建一個新的字串物件 "Java"
        System.out.println(s1 == s2); 
        // 判斷 s1 與 s2 是否指向同一個物件，並印出結果（false）
        // s1 與 s2 內容相同，但指向不同物件
        System.out.println(s1.equals(s2));
        // 判斷 s1 與 s2 的內容是否相同，並印出結果（true）
         
        
        String s3 = "Java"; 
        // 宣告一個 String 物件 s3，並直接使用字面值 "Java" 創建物件
        String s4 = "Java";  
        // 宣告一個 String 物件 s4，並直接使用字面值 "Java" 創建物件
        System.out.println(s3 == s4);  
        // 判斷 s3 與 s4 是否指向同一個物件，並印出結果（true）
        System.out.println(s3.equals(s4));  
        // 判斷 s3 與 s4 的內容是否相同，並印出結果（true）
        
        /*
        == 比較兩個變數是否指向同一個物件
        equals() 比較兩個物件的內容是否相同
        */
    }
}
