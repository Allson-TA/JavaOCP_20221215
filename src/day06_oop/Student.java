package day06_oop;

public class Student extends Person {	//	extends-->繼承Person

	private int socre;
	
	public Student() {
		
	}
	
	public Student(String name,int age,int score) {
		setName(name);
		setAge(age);
		this.socre = score;	//	setScore(score); 兩者方式皆可
	}

	public int getSocre() {
		return socre;
	}

	public void setSocre(int socre) {
		this.socre = socre;
	}

	@Override
	public String toString() {
		return "Student [socre=" + socre + "]" + super.toString();
	}

	
	


}
