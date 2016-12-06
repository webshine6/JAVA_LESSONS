package problem3;

public class Battery extends Product {

	private boolean rechargeable;
	private double discount;

	public Battery() {
		super();
	}

	public Battery(String name, double price) {
		super(name, price);
	}

	public boolean isRechargeable() {
		return rechargeable;
	}

	public void setRechargeable(boolean rechargeable) {
		this.rechargeable = rechargeable;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	@Override
	public String toString() {
		return super.toString() + "| discount: " + discount;
	}

}
