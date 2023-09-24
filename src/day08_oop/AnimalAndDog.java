package day08_oop;


class Animal{
	int feet = 0;
	void move() {
		System.out.println("會動");
	}
	
}

class Dog extends Animal{
	int feet = 4;
	void move() {
		System.out.println("會跑");
	}
	void play() {
		int feet = 2;	//	區域變數
		System.out.println(feet);	//	找最近的 2
		System.out.println(this.feet);	//	找自己物件的變數this 4
		System.out.println(super.feet);	//	找自己物件的this 4
		move();
		this.move();
		super.move();
		
		
	}
}

public class AnimalAndDog {

	public static void main(String[] args) {
		
		Dog dog = new Dog();
		dog.play();

	}

}
