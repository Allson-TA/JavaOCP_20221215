package day21_runnable;

import java.math.BigDecimal;
import java.net.URL;
import java.util.Date;
import java.util.Map;
import java.util.Scanner;
import yahoofinance.Stock;
import yahoofinance.YahooFinance;

public class JobDemo2 {
    public static void main(String[] args) {
        /* 我要建立二個執行緒工作
           1. 得到幸運數字
           2. 得到現在時間
           3. 得到我的外部 ip
           4. 取得今日台灣加權股價指數(^TWII)
           5. 匯率日幣(JPY)對台幣(TWD)
           
           @FunctionalInterface
           public interface Runnable { 
               public abstract void run();
           }
        */
        
        // 透過匿名內部類別來實作
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                // 產生一個隨機的幸運數字並印出
                int luckyNumber = (int)(Math.random() * 100);
                System.out.println(luckyNumber);
            }
        };
        
        // 透過 Java 8 Lambda
        Runnable r2 = () -> {
            // 取得現在的日期和時間並印出
            System.out.println(new Date());
        };
        
        // 透過 Java 8 Lambda
        Runnable r3 = () -> {
            try {
                // 透過外部網站來獲取本機的外部 IP 位址並印出
                URL url = new URL("http://www.j4.com.tw/james/remoip.php");
                String data = new Scanner(url.openStream()).useDelimiter("\\A").next();
                String ip = data.substring(data.indexOf(":")+1, data.indexOf("<br>")).trim();
                System.out.println(ip);
            } catch (Exception e) {
                e.printStackTrace();
            }
        };
        
        // 透過 Java 8 Lambda
        Runnable r4 = () -> {
            try {
                // 透過 Yahoo Finance API 取得今日台灣加權股價指數的相關資訊並印出
                Stock stock = YahooFinance.get("^TWII");
                BigDecimal price = stock.getQuote().getPrice(); // 指數/價格
                BigDecimal change = stock.getQuote().getChange(); // 漲跌
                BigDecimal changeInPercent = stock.getQuote().getChangeInPercent(); // 漲跌幅
                System.out.printf("台灣加權股價指數: %,.2f  %.2f(%.2f %%)\n", 
                        price.doubleValue(), change.doubleValue(), changeInPercent.doubleValue());
            } catch (Exception e) {
                e.printStackTrace();
            }
        };
        
        // 透過 Java 8 Lambda
        Runnable r5 = () -> {
            try {
                // 透過 Yahoo Finance API 取得日幣(JPY)對台幣(TWD)和台幣(TWD)對日幣(JPY)的匯率資訊並印出
                String[] symbols = {"JPYTWD=X", "TWDJPY=X"};
                
                /*	 Stock 物件，它來自 Yahoo Finance 的庫
	                在這個程式碼中，`stock` 是一個 `Stock` 物件，它來自 Yahoo Finance 的庫，用於獲取股票和股票市場相關的資訊。下面是 `getQuote().getChange()` 的用途說明：
	                1. `getQuote()`: `getQuote()` 方法用於獲取特定股票的報價資訊。這包括該股票的價格、漲跌、漲跌幅等相關數據。
	                2. `getChange()`: `getChange()` 方法是 `getQuote()` 方法返回的報價資訊中的一部分。它用於獲取股票的當前價格相對於前一個交易日的價格變化，即股票的價格漲跌金額。
                   - 如果 `getChange()` 返回正數，表示股票價格上漲。
                   - 如果 `getChange()` 返回負數，表示股票價格下跌。
                   - 如果 `getChange()` 返回零，表示股票價格沒有變化。
                */
                
                //	symbols 用於指定要查詢的股票，並將其傳遞給 YahooFinance.get(symbols) 方法
                Map<String, Stock> stocks = YahooFinance.get(symbols); // x: eXchange
                System.out.println(stocks);
                System.out.println(stocks.keySet());	//	stocks 中所有鍵（keys）的集合
                BigDecimal price1 = stocks.get("JPYTWD=X").getQuote().getPrice(); // 指數/價格
                BigDecimal price2 = stocks.get("TWDJPY=X").getQuote().getPrice(); // 指數/價格
                System.out.printf("日幣(JPY)對台幣(TWD): %.2f\n", price1.doubleValue());
                System.out.printf("台幣(TWD)對日幣(JPY): %.2f\n", price2.doubleValue());
                
            } catch (Exception e) {
                e.printStackTrace();
            }
        };
        
        // 建立執行緒執行來指定工作
        Thread t1 = new Thread(r4); // 使用執行緒t1執行r3，用來取得外部IP位址
        t1.start(); // 啟動t1執行緒
    }
}
