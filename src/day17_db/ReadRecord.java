package day17_db;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.Date;

public class ReadRecord {
    // 抓取 student 資料表中的資訊
    public static void main(String[] args) throws Exception {
        // 1. 驅動程式建立(JDBC 4.0 此行可以不用寫)
        // 何謂 JDBC 4.0 ? mysql-connector-j-8.0.32.jar 檔中有此結構 MTEA-INF > services > java.sql.Driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        // 2. 透過 DriverManager 來建立 Connection
        String url = "jdbc:mysql://localhost:3306/javaocp_20221215?serverTimezone=Asia/Taipei&characterEncoding=utf-8&useUnicode=true";
        String user = "root";
        String password = "allson";
        Connection conn = DriverManager.getConnection(url, user, password);
        
        // 3. 建立 sql 查詢語句
        String sql = "select id, name, score, birth from student";
        
        // 4. 建立 Statememt 物件
        Statement stmt = conn.createStatement();
        
        // 5. 在 stmt 中放入 sql 並回傳 ResultSet 物件
        //	執行一個 SQL 查詢後，通常會得到一個稱為 ResultSet（結果集）的物件
        ResultSet rs = stmt.executeQuery(sql);
        
        // 6. 透過 while 迴圈將資料依序取出
        // ResultSetMetaData 則是一個用來描述 ResultSet 中的欄位的元資料（metadata）物件
        // ResultSetMetaData 來獲取欄位的數量和名稱，並將這些資訊用格式化的方式輸出成表頭。這樣，你可以確認查詢結果中每個欄位的名稱，並將其顯示在控制台上
        ResultSetMetaData md = rs.getMetaData();	//	可以取得欄位titel
        //	System.out.println(md);	會顯示ColumnName資料
        for(int i=1;i<=md.getColumnCount();i++) {
            System.out.printf("%10s ", md.getColumnName(i));
        }
        System.out.println("\n------------------------------------------------------------------------");
        
        while (rs.next()) { // rs.next() 是否有資料列 true的話會繼續往下執行
        	//	rs.next() 用於遍歷結果集中的每一行資料。如果還有下一行資料，則返回 true，否則返回 false
        	int id      = rs.getInt("id");	//	rs是將資料抓出來後轉乘int
            String name = rs.getString("name");	//	rs是將資料抓出來後轉成String
            int score   = rs.getInt("score");	//	rs是將資料抓出來後轉乘int
            Date birth  = rs.getDate("birth");	//	rs是將資料抓出來後轉乘Date
            
            System.out.printf("%10d %10s %10d %10s\n", id, name, score, birth);
        }
        
        // 7. 依序關閉資源連線
        //	先開先關(順序)
        rs.close();
        stmt.close();
        conn.close();
    }
    
}