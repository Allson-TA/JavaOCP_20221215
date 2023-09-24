package day18_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo2 {

	public static void main(String[] args) {
		
		//	若發生 InputMismatchException 錯誤 請顯示"請輸入數字"
		//	不管有無錯誤 最後都要出現"程式結束"
		
		int banana = 10;
		System.out.printf("有 %d 個香蕉,請輸入要分的人數:",banana);
		Scanner scanner = new Scanner(System.in);
		try {
		int people = scanner.nextInt();
		int average = banana / people;
		System.out.printf("每人得 %d \n",average);
		} catch(InputMismatchException e2) {
			System.out.println("請輸入數字");
		} catch (ArithmeticException e) {
			System.out.println(e);
			System.out.println(e.getMessage());
			System.out.println("人數不可為");
		}
		System.out.println("程式結束");
	}
	
}
