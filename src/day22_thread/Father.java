package day22_thread;

public class Father extends Thread{

	@Override
	public void run() {
		System.out.println("爸爸下班回家");
		System.out.println("爸爸準備洗澡");
		System.out.println("爸爸發現沒瓦斯");
		System.out.println("爸爸打電話請瓦斯工人送瓦斯");
		
		//	建立 Worker執行緒
		Worker worker = new Worker();
		worker.start();
		
		//	worker.join();需要try catch
		try {
			worker.join();
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		
		System.out.println("爸爸開始洗澡");
		System.out.println("爸爸洗好澡了");
	}

	
	
	
	
}
