package May25;

public class Vehicle {

	private String brand;
	private String model;
	protected int year;
	
	
	public Vehicle(String brand, String model, int year) {
		super();
		this.brand = brand;
		this.model = model;
		this.year = year;
	}
	
	public String getBrand() {
		return brand;
	}
	public String getModel() {
		return model;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setModel(String model) {
		this.model = model;
	}
}
