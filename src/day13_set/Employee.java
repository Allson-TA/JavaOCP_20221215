package day13_set;

import java.util.Objects;

//	因為是interface 所以要implements Comparable<Employee>
public class Employee implements Comparable<Employee>{
    private int id;
    private String name;
    private int age;
    private int salary;

    public Employee() {
    }

    public Employee(int id, String name, int age, int salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + this.id;
        hash = 37 * hash + Objects.hashCode(this.name);
        hash = 37 * hash + this.age;
        hash = 37 * hash + this.salary;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Employee other = (Employee) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.age != other.age) {
            return false;
        }
        if (this.salary != other.salary) {
            return false;
        }
        return Objects.equals(this.name, other.name);
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + '}';
    }

    //	可以決定要用什麼排序(小到大)
    @Override
    public int compareTo(Employee emp) {
        int result = this.id - emp.id;
        return result;
    }
    
    /*	可以決定要用什麼排序(大到小)
    @Override
    public int compareTo(Employee emp) {
        int result = emp.id - this.id;
        return result;
    }   
    */ 
}