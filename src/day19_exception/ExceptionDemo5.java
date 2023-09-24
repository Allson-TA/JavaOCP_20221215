package day19_exception;

//	自己建立錯誤訊息
public class ExceptionDemo5 {

	public static void main(String[] args) {
		try {
			boolean isPass = login("admin","1234");
			System.out.printf("登入資訊 : %b\n",isPass);
		} catch(LoginFailException e) {
			System.out.printf("登入錯誤訊息= "+ e.getMessage());
		}
		
		try {
			boolean isPass2 = login("admin2","2222");
			System.out.printf("登入資訊 : %b\n",isPass2);
		} catch(LoginFailException e) {
			System.out.printf("登入錯誤訊息= "+ e.getMessage());
			e.howTo();
		}
	}
	
	//	登入驗證
	public static boolean login(String username,String password) throws LoginFailException{
		
		if(username.equals("admin") && password.equals("1234")) {
			return true;
		} else {
			//	RuntimeException 執行時期才要處理的例外
			//	Exception		 編譯時需要強迫處理的錯誤
			//	Exception		 要在main方法拋出
			LoginFailException e = new LoginFailException("您的使用者名稱或密碼不正確");
			throw e;
		}
	}

}
