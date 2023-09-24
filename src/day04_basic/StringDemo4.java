package day04_basic;

public class StringDemo4 {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("Java");
		//	sb = sb.append("SCJP");
		sb.append("SCJP");
		//	因為同一塊記憶體變動，不用重新指向，所以sb=可加可不加，但遇到String就必需加
		System.out.println(sb);
	}

}
