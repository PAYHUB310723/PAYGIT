package lang;

import java.util.Objects;

public class Clone  {
	public static void main(String[] args) {
		Laptop dell = null;
		// the memory is alloted
		dell = new Laptop("Dell", 50.60f);
		System.out.println(dell);
		// make a copy of laptop
		Laptop dell1 = null;
		// the reference (memory address) of dell is assigned to dell1
//		dell1 = dell;
		
		try {
			dell1 = (Laptop) dell.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		System.out.println(dell1);
		dell1.laptopName = "Inspirion";
		dell1.price = 60f;
		System.out.println(dell1);
		System.out.println(dell);
	}
}

class Laptop implements Cloneable {
	// Fields
	public String laptopName;
	public float price;

	@Override
	public int hashCode() {
		return Objects.hash(laptopName, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Laptop other = (Laptop) obj;
		return Objects.equals(laptopName, other.laptopName)
				&& Float.floatToIntBits(price) == Float.floatToIntBits(other.price);
	}

	@Override
	public String toString() {
		return "Laptop [laptopName=" + laptopName + ", price=" + price + "]";
	}

	// Default constructor
	public Laptop(String plaptopName, float pprice) {
		laptopName = plaptopName;
		price = pprice;
	}

	public Laptop() {

	}

	// method to print the details
	public void getDetails() {
		System.out.println(laptopName);
		System.out.println(price);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
}
