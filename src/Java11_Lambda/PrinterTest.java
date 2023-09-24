package Java11_Lambda;

public class PrinterTest {

	public static void main(String[] args) {
		
		Printer p1 = (data) -> System.out.println(data);
		p1.print("aaa");
		
		Printer p2 = System.out :: println;
		p2.print("aaaa");

	}

}
