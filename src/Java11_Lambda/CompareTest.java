package Java11_Lambda;

public class CompareTest {

	public static void main(String[] args) {
		
		Compare c1 = (x,y) -> Math.max(10, 20);
		System.out.println(c1.max(10, 20));
		
		Compare c2 = Math::max;
		System.out.println(c1.max(10, 20));
		
	}

}
