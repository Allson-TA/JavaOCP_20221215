package day05_oop;

public class Pen {
	
//	Pen的color只能是red , blue , black，預設是blue
//	Pen的price必須介於10~20之間，預設15

	private String color = "blue";
	private int price = 15;

	public String getColor() {
		return color;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		if(price < 10) {
			this.price = 10;
		} else if(price > 20) {
			this.price = 20;
		} else {	//	10 <= price <==20之間
			this.price = price;
		}
		
	}
	
	public void setColor(String color) {
		color = color.toLowerCase();	//	全部轉小寫
		/*
		if(color.equals("red") || color.equals("blue") || color.equals("black") {
			this.color = color;
		}
		*/
		
		switch (color) {
		case "red":
		case "blue":
		case "black":
			this.color = color;
			
			
		}
	
	}
	
}
