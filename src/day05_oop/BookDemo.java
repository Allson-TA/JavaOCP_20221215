package day05_oop;


public class BookDemo {

	public static void main(String[] args) {
		Book b1 = new Book();
		b1.title = "Java";
		b1.setPrice(250);
		b1.setPages(750);
		b1.authorName ="John";
		b1.setAuthorAge(18);
		System.out.println("價格 $" + b1.getPrice());
		System.out.println(b1.toString());
	}

}
