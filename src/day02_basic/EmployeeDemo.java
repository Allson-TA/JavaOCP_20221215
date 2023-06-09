package day02_basic;

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee emp1 = new Employee("John", 40000);
        Employee emp2 = new Employee("Mary", 45000);
        Employee emp3 = new Employee("Jack", 55000);
        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);
        
        //  建立一個 Employee[] 陣列
        //  employees自行建立的陣列名稱
        Employee[] employees = {emp1, emp2, emp3};
        //  走訪每一個員工元素 for-each
        //  (元素型別 元素變數 : 集合或陣列)
        for(Employee emp : employees) {
            System.out.println(emp);
        }
        //  走訪每一個員工元素 for-loop
        //  (初始值; 條件; 迭代器)
        for(int i=0;i<employees.length;i++) {
            System.out.println(employees[i]);
        }
    }
}