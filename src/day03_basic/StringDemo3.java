package day03_basic;

public class StringDemo3 {

	public static void main(String[] args) {
		String s1 = new String("Java");
		String s2 = "Java";
		
		s1 = s2;
		s1 = s1.intern();
		//	將 s1 所指向的字串放入到String pool 中
		
		System.out.println(s1 == s2);

	}

}


/*
1.
String s1 = new String("Java");
這種方式會在記憶體中創建一個新的 String 物件，並將它的值設為 "Java"
然後將其賦值給變數 s1。因為 new 關鍵字會強制創建一個新的物件
所以即使以前已經有一個值為 "Java" 的 String 物件存在，這種方式仍然會創建一個新的物件

2.
String s1 = new String("Java");
這種方式會在記憶體中創建一個新的 String 物件，並將它的值設為 "Java"
然後將其賦值給變數 s1。因為 new 關鍵字會強制創建一個新的物件
所以即使以前已經有一個值為 "Java" 的 String 物件存在，這種方式仍然會創建一個新的物件

3.
s1.intern() 的作用是將 s1 所指向的字串放入到 String pool 中
因為在 Java 中，如果使用 new 關鍵字創建字串物件，則該物件是不會被加入到 String pool 中的
所以在程式碼中使用 s1.intern()，可以確保 s1 所指向的字串會被加入到 String pool 中
從而減少記憶體的使用
*/