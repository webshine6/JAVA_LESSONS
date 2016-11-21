package objecttocsv;

public class Product {

	private long id;
	private String name;
	private double price;
	private boolean vatApplicable;

	public Product(long id, String name, double price, boolean vatApplicable) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.vatApplicable = vatApplicable;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isVatApplicable() {
		return vatApplicable;
	}

	public void setVatApplicable(boolean vatApplicable) {
		this.vatApplicable = vatApplicable;
	}

}
