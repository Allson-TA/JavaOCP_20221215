package day12_set;

import java.util.LinkedHashSet;
import java.util.Set;

public class Demoset5 {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee("Programmer", 65000);
		Employee emp2 = new Employee("Manager", 85000);
		Employee emp3 = new Employee("Programmer", 55000);
		Employee emp4 = new Employee("Programmer", 75000);
		Employee emp5 = new Employee("Manager", 95000);
		
		Set <Employee>employees = new LinkedHashSet<Employee>();
		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
		employees.add(emp4);
		employees.add(emp5);
		System.out.println(employees);
		System.out.println("員工人數: " + employees.size());	//	size() 集合元素的個數
		
		//	請問 Programmer 的總薪資?
		int sum = 0;
		int avg = employees.size();
        for(Employee emp : employees) {
            if(emp.getName() == "Programmer") {
            	sum += emp.getSalary();
            	 
            }
        }
        System.out.println("Programmer總薪資"+sum);
	
        avg = sum/avg;
        System.out.println("Programmer平均薪資"+avg);
		
        
        //	Java 8
        int avg2 = employees.size();
        int sum2 = employees.stream()
        		.filter(emp -> emp.getName().equals("Programmer"))
                .mapToInt(emp -> emp.getSalary())
                .sum();
        System.out.println("Programmer總薪資"+sum2);
        System.out.println("Programmer總薪資"+sum2/avg2);
        
        
        // 	請問 Manager 的總薪資?
        int sum3 = 0;
		int avg3 = 2;
        for(Employee emp : employees) {
            if(emp.getName() == "Manager") {
            	sum3 += emp.getSalary();
            	 
            }
        }
        System.out.println("Manager總薪資"+sum3);
	
        avg3 = sum3/avg3;
        System.out.println("Manager平均薪資"+avg3);
		
        
        //	Java 8
        int avg4 = employees.size();
        int sum4 = employees.stream()
        		.filter(emp -> emp.getName().equals("Manager"))
                .mapToInt(emp -> emp.getSalary())
                .sum();
        System.out.println("Manager總薪資"+sum4);
  
	}
}


