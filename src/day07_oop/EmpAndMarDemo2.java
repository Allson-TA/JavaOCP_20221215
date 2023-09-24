package day07_oop;

public class EmpAndMarDemo2 {

	public static void main(String[] args) {
		
		//	instanceof類型轉換
		
		Employee emp1 = new Employee();
		emp1.job();
		//	寫一個判斷，如果是Manager就轉換
		if(emp1 instanceof Manager) {
			((Manager)emp1).report();
		}
		
		
		
		Employee emp2 = new Manager();
		emp2.job();
		if(emp2 instanceof Manager) {
			((Manager)emp2).report();
		}

		

	}

}
