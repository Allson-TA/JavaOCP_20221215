package day18_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo1 {
	public static void main(String[] args) {
		
		int apple=10;
		System.out.println("有10顆蘋果 請輸入要分的人數:");
		Scanner scanner = new Scanner(System.in);
		
		try {	//	只要try包起來的程式有錯 就會執行catch錯誤訊息
		int people = scanner.nextInt();	//	取得使用者所輸入的人數
		int avg = apple / people;
		System.out.printf("每人可得 %d 顆\n",avg);
		} catch(InputMismatchException e1) {
			System.out.println("錯誤物件: "+e1);
			System.out.println("錯誤訊息: "+e1.getMessage());
			e1.printStackTrace(System.out);	//	印出詳細錯誤
			System.out.println("輸入錯誤");	//	自訂錯誤訊息
			System.out.println("程式無法執行");
		}
		System.out.println("程式結束");
	}
}
