package day14_list;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		
		//	synchronized	同步集合
		//	支援多執行緒存取
		//	Vector v = new Vector(22);	//	剛開始建立的時候需要多少總空間，空白的話則給10
		Vector v = new Vector(21,3);	//	假設超過總空間22的話，則給出空間一次給3即可，就不會一下變成42
		
		//	size 已用空間
		System.out.println("已用空間數 "+v.size());
		
		//	capacity 總空間
		System.out.println("總空間 " + v.capacity());
		
		for(int i = 0;i<21;i++) {
			v.add(i);
		}
		System.out.println(v);
		System.out.println("已用空間數 "+v.size());
		System.out.println("總空間 " + v.capacity());
	}
	/*
	 * 如果可用空間 > 總空間數
	 * 總空間數 則會進位*平方空間
	 * 如果超過20 總空間40
	 * 如果超過40 總空間80
	 * 
	 * 如果可用空間 = 總空間數
	 * 總空間數 則會剛好而不會進位
	 * 
	 * 
	 */
}
