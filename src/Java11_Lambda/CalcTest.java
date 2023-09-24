package Java11_Lambda;

public class CalcTest {
	
	public static void main(String[] args) {
		
		//	1. 透過匿名內部類別
		Calc calc= new Calc() {
			
			@Override
			public int add(int x, int y) {
				return x + y;
			}
		};
		
		System.out.println(calc.add(10, 20));
		
		//	2. 利用Lambda
		Calc calc2 = (int x , int y) -> {
			return x + y;
		};
		
		System.out.println(calc2.add(1, 2));
		
		//	3. 利用Lambda (因為Interface裡面只有設定一個方法，可以直接不使用型別)
		Calc calc3 = (x,y) -> {
			return x + y;
		};
		
		System.out.println(calc3.add(20, 20));
		
		//	4. 利用Lambda (不寫return，程式自動判別)
		Calc calc4 = (x,y) -> x + y;
		
		System.out.println(calc4.add(20, 40));
	}
	
}
