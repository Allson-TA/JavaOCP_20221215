package day20_thread;

public class JobB extends Thread{
	
	//	繼承 Thread 才可以使用run方法
	@Override
	public void run() {	//	存放著給執行緒的工作
		work();
	}
	
	//	用private的原因是因為不要讓jobB.work();執行
	private void work() {
		
		//	取得當前正在執行的執行緒的名稱。如果有多個執行緒在同一時間運行，這段程式碼將返回當前正在執行的執行緒的名稱
		String tName = Thread.currentThread().getName();
		
		//	走100步的迴圈
		for(int i=1;i<=100;i++) {
			System.out.printf("%s 走了 %d 步\n",tName,i);
		}
	}

}
