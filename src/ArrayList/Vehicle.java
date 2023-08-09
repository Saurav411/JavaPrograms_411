package ArrayList;

public class Vehicle {
	public Vehicle(String make, String model, int price, boolean goodCondition) {
		super();
		this.make = make;
		this.model = model;
		this.price = price;
		this.goodCondition = goodCondition;
	}

	@Override
	public String toString() {
		return "Vehicle [make=" + make + ", model=" + model + ", price=" + price + ", goodCondition=" + goodCondition
				+ "]";
	}

	String make;
	String model;
	int price;
	boolean goodCondition;

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public boolean isGoodCondition() {
		return goodCondition;
	}

	public void setGoodCondition(boolean goodCondition) {
		this.goodCondition = goodCondition;
	}

}
