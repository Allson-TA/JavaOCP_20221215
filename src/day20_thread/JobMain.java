package day20_thread;

public class JobMain {

	public static void main(String[] args) {
		
		String tName = Thread.currentThread().getName();
		System.out.println(tName);
		
		JobA jobA = new JobA();
		JobB jobB = new JobB();
		JobC jobC = new JobC();
		
		//	將jobC設定為背景執行緒
		jobC.setDaemon(true);
		
		//	改名字
		jobA.setName("兔子");
		jobB.setName("烏龜");
		jobC.setName("背景音樂");
			
		//	權限設定 1~10	(預設是5)
		//	數字越大表示越容易先做完
		//	雖然設定權限但不保證一定，原則問題，有可能執行緒給的時間少
		jobB.setPriority(Thread.MAX_PRIORITY);	//	10
		jobA.setPriority(Thread.MIN_PRIORITY);	//	1
		jobC.setPriority(Thread.MIN_PRIORITY);	//	1
		
		/*		
		尚未繼承Thread的時候才用work方法 (單工)
		jobA.work();
		jobB.work();
				
		run方法不能自己執行，只有start可以執行
		run方法只能由執行緒自己處理
				
		繼承Thread的時候使用start方法 (多工)
		*/
		
		jobA.start();
		jobB.start();
		jobC.start();
		
	}

}
