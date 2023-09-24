package day02_basic;

public class Employee {
    String name;
    int salary;
    
    // 建構子
    //有兩個參數的話，在New的時候也要兩個值才會符合參數條件
    public Employee(String name, int salary) {
        //This意思 : 物件.(的)
        this.name = name;   
        this.salary = salary;
    }
    
    /*  除非參數跟當初定義的不一樣
    public Employee(String a, int b) {
        //	定義不同名稱就不使用This.
        name = a;   
        salary = b;
    }    
    */
    
    @Override
    public String toString() {
        return "Employee{" + "name=" + name + ", salary=" + salary + '}';
    }
    
}