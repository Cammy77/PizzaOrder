package model;

/**
 * Cameron Mockobee - cmockobee1@dmacc.edu CIS175 - Fall 2023 Sep 18, 2023
 */
public class PizzaOrder {
	private String size;
	private String topping;
	private double price;

	public PizzaOrder() {
		super();
	}

	public PizzaOrder(String size) {
		super();
		this.size = size;
		setSize(size);
	}
	

	public PizzaOrder(String size, String topping) {
		super();
		this.size = size;
		this.topping = topping;
		setSize(size);
		setTopping(topping);
	}

	/**
	 * @return the size
	 */
	public String getSize() {
		return size.toUpperCase();
	}

	/**
	 * @param size the size to set
	 */
	public void setSize(String size) {
		this.size = size;
		
	}

	/**
	 * @return the topping
	 */
	public String getTopping() {
		return "delicious " + topping + " pizza!! Enjoy!!";
	}

	/**
	 * @param topping the topping to set
	 */
	public void setTopping(String topping) {
		this.topping = topping;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		if (getSize().equalsIgnoreCase("Large")) {
			price = 13.99;
		} else if (getSize().equalsIgnoreCase("Medium")) {
			price = 10.99;
		} else {
			price = 8.99;
		}
	}

	public double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "You have ordered one " + topping + " pizza, Enjoy!!";
	}

	
	
	

}
