package day20_thread;

public class HelloMainThread {

	public static void main(String[] args) {
		
		System.out.println("Heool World 1");
		System.out.println("Heool World 2");
		System.out.println("Heool World 3");
		
		//	取得執行緒名稱
		String tName = Thread.currentThread().getName();
		System.out.println("執行緒名稱: "+tName);
		
	}

}
