package entity;

public class Product implements Comparable<Product> {

	private String name;
	private Double price;

	public Product() {
	}

	public Product(String name, double price) {
		setName(name);
		setPrice(price);
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public String priceTag() {
		return getName() + " $ " + getPrice();
	}
	
	

	@Override
	public String toString() {
		return name + ", "+String.format("% .2f", price);
	}

	@Override
	public int compareTo(Product other) {
		// TODO Auto-generated method stub
		return price.compareTo(other.getPrice());
	}
}
