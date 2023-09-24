package day13_list;

import java.util.Objects;

import day13_set.Employee;

public class Drink implements Comparable<Drink>{
	
	private String name;
	private int price;
	
	public Drink() {
		
	}
	
	public Drink(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Drink other = (Drink) obj;
		return Objects.equals(name, other.name) && price == other.price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Drink [name=" + name + ", price=" + price + "]";
	}
	
    @Override
    public int compareTo(Drink drink) {
        int result = this.price - drink.price;
        return result;
    }
	
}
