package day12;

import java.util.Objects;

public class Employee {
	
	private String name;
	private int age;
	private String birth;
	private int salary;
	
	@Override
	public int hashCode() {
		return Objects.hash(age, birth, name, salary);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return age == other.age && Objects.equals(birth, other.birth) && Objects.equals(name, other.name)
				&& salary == other.salary;
	}
	

	
	
	
	
}
