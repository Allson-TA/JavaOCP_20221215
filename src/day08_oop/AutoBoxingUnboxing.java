package day08_oop;

//	自動拆裝箱
//	自動裝箱 AutoBoxing 將 int(基本) 轉 intger(物件)
//	自動拆箱 AutoBoxingUnboxing intger(物件) 轉 int(基本)
public class AutoBoxingUnboxing {

	public static void main(String[] args) {
		int x = Integer.MAX_VALUE;
		System.out.println(x);
		
		String s = "75";
		int y = Integer.parseInt(s);	//	將字串 "75" 變成整數75
		System.out.println(y);
	
		//	定一個物件型的整數
		Integer a1 = Integer.valueOf(100);
		System.out.println(a1);
		
		//	自動裝箱 AutoBoxing 將 int(基本) 轉 intger(物件)
		Integer a2 =100;	
		System.out.println(a2);
		
		//	自動拆箱 AutoBoxingUnboxing intger(物件) 轉 int(基本)
		int a3 = a1.intValue();
		System.out.println(a3);
		
		//	AutoBoxing
		int a4=a1;	//	相當於 a1.intValue()
		System.out.println(a4);
	}

}
