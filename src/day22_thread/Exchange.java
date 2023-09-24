package day22_thread;

import java.util.concurrent.Callable;

import com.github.javafaker.Stock;

import yahoofinance.YahooFinance;

public class Exchange implements Callable<Double>{

	private String symbol;
	public Exchange(String cuurrency) {
		this.symbol = cuurrency + "TWD=X";
	}
		
	@Override
	public Double call() throws Exception {
		yahoofinance.Stock stock = YahooFinance.get(symbol);
		return stock.getQuote().getPrice().doubleValue();
	}

	
	
}
