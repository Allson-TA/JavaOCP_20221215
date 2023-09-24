package day05_oop;

//	描述一本書即有哪些資料?

public class Book {
	String title;	//	書籍名稱
	private int price;		//	價格 , private-->私有
	private int pages;		//	頁數
	String authorName;	//	作者
	private int authorAge;		//	作者年齡
	
	//	因為是私有設定，所以要用條件以及public公開給BookDemo取用，判斷完成後再回傳給上面的price
	public void setPrice(int price) {
		if(price > 200) {
			this.price = price;
		} else {	//	如果條件不符合，可以設定else條件
			this.price = 200;
		}
	}
	
	public int getPrice() {
		return this.price;
		
	}
	
	public void setPages(int pages) {
		if(pages >= 1) {
			this.pages = pages;
		}
	}
	
	public void setAuthorAge(int age ) {
		if(age > 18) {
			this.authorAge = age;
		}
	}
	// 重寫(覆盖）父類別的方法
	@Override
	// 重寫toString()方法，返回一個表示對象内容的字符串
	public String toString() {
		return "Book [title=" + title + ", price=" + price + ", pages=" + pages + ", authorName=" + authorName
				+ ", authorAge=" + authorAge + "]";
	}
	/* 返回一个包含对象属性值的字符串，用于表示Book对象的信息
	属性包括title、price、pages、authorName和authorAge
	字符串的格式为"[属性名1=属性值1, 属性名2=属性值2, ...]" 
	*/
	
	
	
	
}
