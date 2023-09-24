package day19_exception;

public class AssertionDemo1 {

	public static void main(String[] args) {
		
		int score = 555;
		
		assert(score>=0 && score <=100):"分數錯誤"+score;
		
		if(score >= 70) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
		
	}

}

/*
JavaOCP_20221215按右鍵
選擇 Properties
選擇Run/Debug Settings
尋找開啟assert的class
點選開啟後進入Argurments 在VM arguments裡輸入-ea
點選套用後即可開啟assert功能
*/