package entity;

public class Product02 implements Comparable<Product02>{

	private String name;
	private Double price;

	public Product02() {
	}

	public Product02(String name, double price) {
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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((price == null) ? 0 : price.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product02 other = (Product02) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (price == null) {
			if (other.price != null)
				return false;
		} else if (!price.equals(other.price))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Product02 [name= " + name + ", price= " + price + "]";
	}

	@Override
	public int compareTo(Product02 other) {		
		return name.toUpperCase().compareTo(other.getName().toUpperCase());
	}
	
	
}
