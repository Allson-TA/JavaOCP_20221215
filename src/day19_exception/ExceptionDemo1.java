package day19_exception;

public class ExceptionDemo1 {

	public static void main(String[] args) throws InterruptedException{
		bar();	//	呼叫 bar() : ....Unchecked Exception
	
		try {
		foo();	//	呼叫 foo() : ....Checked Exception
		} catch(InterruptedException e) {
			
		}
		
		foo();	//	如果想單獨叫，就需要再main方法thows拋出
	}
	
	//	假設底下這兩隻例外都是別人寫的，一定要用
	//	不用再編譯時期 RuntimeException
	public static void bar() throws RuntimeException{
		System.out.println("bar...");
	}
	
	public static void foo() throws InterruptedException{
		System.out.println("foo...");
	}
	
}
