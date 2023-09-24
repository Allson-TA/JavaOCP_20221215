package day17_db;

import com.github.javafaker.Faker;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Random;

public class CreateRecord {
    // 在 student 資料表中建立一筆紀錄
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/javaocp_20221215?serverTimezone=Asia/Taipei&characterEncoding=utf-8&useUnicode=true";
        String user = "root";
        String password = "allson";
        Connection conn = DriverManager.getConnection(url, user, password);
        // 1. 建立 sql 新增語句
        String sql = "insert into student(name, score, birth) values(?, ?, ?)";
        // 2. 建立 PreparedStatement
        Faker faker = new Faker(); // 透過 faker 產出動態測試資料
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, faker.name().firstName());
        pstmt.setInt(2, faker.number().numberBetween(0, 100));
        // 因為 pstmt.setDate(int, java.sql.Date)
        // faker.date().birthday() 會得到 java.util.Date
        // 要透過 new java.sql.Date(faker.date().birthday().getTime()) 轉成 java.sql.Date 的格式
        pstmt.setDate(3, new Date(faker.date().birthday(15, 25).getTime()));
        int rowcount = pstmt.executeUpdate(); // 執行更新 執行 SQL 語句並返回影響的資料行數
        System.out.printf("新增資料筆數: %d\n", rowcount);
        // 3. 關閉資源 關閉 PreparedStatement 物件和資料庫連接，釋放相關的資源
        pstmt.close();
        conn.close();
    }
}