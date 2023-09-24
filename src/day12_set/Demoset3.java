package day12_set;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

import Java11_Lambda.Printer;

public class Demoset3 {
	
	public static void main(String[] args) {
		
		//	如果沒有寫equls & hashcode 同樣的還是會出現
		//	如果有放equls & hashcode 同樣的不會出現
		Employee emp1 = new Employee("John", 50000);
		Employee emp2 = new Employee("Mary", 65000);
		Employee emp3 = new Employee("Bobo", 80000);
		Employee emp4 = new Employee("Bobo", 80000);
		
		//	如果沒有<Employee>，employees.add(裡面可以放其他元素)
		//	要設定只能放Employee資料元素，則需要前後都加<Employee>
		Set <Employee>employees = new LinkedHashSet<Employee>();
		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
		employees.add(emp4);
		//	如果沒有寫equls & hashcode 同樣的還是會出現
		//	如果有放equls & hashcode 同樣的不會出現
		System.out.println(employees);
		
		for(Employee emp : employees) {
			System.out.printf("姓名:%s 薪資: $%d\n",emp.getName(),emp.getSalary());
		}
		
		//	Java 8 stream
		//	每一個集合在 Java 8 之後都預設支援 stream()
		employees.forEach(System.out::println);

		
		
	}
	
	
	
}
