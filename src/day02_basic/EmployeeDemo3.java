package day02_basic;

import java.util.ArrayList;

//類別可以讓使用者輸入資料，並且讓程式能夠讀取使用者輸入的資料。在此之後，您可以使用Scanner物件來接收使用者輸入的值並將其存儲在變數中
import java.util.Scanner;

public class EmployeeDemo3 {

    public static void main(String[] args) {
        //  動態陣列
        ArrayList<Employee> employees = new ArrayList<>();  // 建立一個空的ArrayList，用來存放Employee物件

        while (true) {            // while迴圈，條件為true，會一直執行下去直到遇到break或系統關閉
            Scanner scanner = new Scanner(System.in);   // 建立一個Scanner物件，用來接收使用者從鍵盤輸入的資料
            System.out.print("請輸入員工姓名 薪資 : ");   // 在終端機上顯示提示字串，提示使用者輸入員工姓名和薪資
            String name = scanner.next();   // 接收使用者從鍵盤輸入的員工姓名，並存放到變數name中
            int salary = scanner.nextInt();  // 接收使用者從鍵盤輸入的員工薪資，並存放到變數salary中
            employees.add(new Employee(name, salary));  // 建立一個新的Employee物件，使用剛剛輸入的員工姓名和薪資，然後加入到一個employees的容器裡
            System.out.print("資料加入成功: 是否要繼續(y/n)?");
            String check = scanner.next().intern(); // 接收使用者從鍵盤輸入的字串，使用 intern()方法將其放到 String pool 中，使得之後的字串比較可以使用==來進行比較
            if (check == "n") { // 如果使用者輸入的是'n'，就跳出while迴圈
                break;
            }
        }

        System.out.println("資料筆數: " + employees.size());    //動態陣列有幾筆資料要用size
        System.out.println(employees);
        int sum = 0;
        for (Employee emp : employees) {
            System.out.println(emp);
            sum += emp.salary;
        }
        System.out.println("總薪資: " + sum);
    }

}
