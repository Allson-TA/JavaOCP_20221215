package day18_exception;

import java.util.Scanner;

public class ExceptionDemo3 {

	public static void main(String[] args) {
		
		int orange = 10;
		System.out.printf("有 %d 個香蕉,請輸入要分的人數:",orange);
		Scanner scanner = new Scanner(System.in);
		 
		//	先拿到資料 先不要轉型態
		String data = scanner.next();
		
		//	驗證data是否都是數字
		boolean checkNumric = isNumeric(data);
		if(checkNumric) {
		
			//	判斷輸入的是不是數字
			//	將字串轉數字
			int people = Integer.parseInt(data);
			
			//	判斷 people 是否>=0
			if(people >=0) {
				int average = orange / people;
				System.out.printf("每人得 %d \n",average);
			} else {
				System.out.println("人數必須 > 0");
			}
		} else {
			System.out.println("人數必須是數字");
		}
			
		System.out.println("程式結束");
		
	}
	
	public static boolean isNumeric(String data) {
		for(int i=0;i<data.length();i++) {
			//	方法用於檢查一個字符是否是數字字符。如果字符是數字字符
			if(!Character.isDigit(data.charAt(i))) {
				return false;
			}
		}
		return true;
	}
	
}
