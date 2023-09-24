package Java11_Lambda;

public class BMITest {

	public static void main(String[] args) {
		
		//	1. 透過匿名內部類別
		
		BMI bmi1 = new BMI() {
			
			@Override
			public double getValue(double h, double w) {
				double bmi = w/Math.pow(h/100, 2);
				return bmi ;
			}
		};
		
		System.out.println(bmi1.getValue(170, 60));
		
		//	2. 利用Lambda
		BMI bmi2 = (double h , double w) -> {
			double bmi = w/Math.pow(h/100, 2);
			return bmi;
		};
		
		System.out.println(bmi2.getValue(170, 60));
		
		//	3. 利用Lambda (因為Interface裡面只有設定一個方法，可以直接不使用型別)
		BMI bmi3 = (h,w) -> {
			double bmi = w/Math.pow(h/100, 2);
			return bmi;
		};
		
		System.out.println(bmi3.getValue(170, 60));
		
		//	4. 利用Lambda (不寫return，程式自動判別)
		BMI bmi4 = (h,w) -> w/Math.pow(h/100, 2);
		
		System.out.println(bmi3.getValue(170, 63));
	}

}
