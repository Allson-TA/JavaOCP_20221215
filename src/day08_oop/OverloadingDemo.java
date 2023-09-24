package day08_oop;

//	多載 / 超載範例
public class OverloadingDemo {

	public static void print(double x) {
		System.out.println("B");
	}
	
	public static void print(Float x) {
		System.out.println("C");
	}
	
	public static void print(int x) {
		System.out.println("A");
	}
	
	public static void print(Integer x) {
		System.out.println("D");
	}
	
	
	public static void main(String[] args) {
		print(100);

	}

	//	會找最相近的類別
	
}
