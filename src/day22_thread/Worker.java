package day22_thread;

public class Worker extends Thread{

	@Override
	public void run() {
		System.out.println("瓦斯工人送瓦斯");
		
		//	模擬瓦斯工人
		
		//	條件部分 x<Long.MIN_VALUE 永遠不會為真。這個循環看起來像是一個故意創建的無限循環，目的可能是為了模擬一個耗時的操作。
		for(long x=0;x<Long.MIN_VALUE;x++);
			
		System.out.println("工人裝好瓦斯");

	}

	
	
}
