package day04_basic;

public class StringExam2 {

	public static void main(String[] args) {
		String a = "Java";
		a = add(a);
		System.out.println(a);
	}
	
	//	a.add是為了要把字串串接，Java + (add) SCJP
	
	public static String add(String s) {
		s = s + "SCJP";
		return s;
	}
	
	

}
