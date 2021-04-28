package main;



import categories.PaymentType;

public abstract class PaymentMethod {
	private String id;
	private Vehicle vehicle;
	private PaymentType type;
	
	public abstract Long calculateFee(Vehicle vehicle);
	
	public PaymentMethod(PaymentType pType) {
		this.setType(pType);
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	@Override
	public String toString() {
		return "PaymentMethod [id=" + id + ", vehicle=" + vehicle + "]";
	}

	public PaymentType getType() {
		return type;
	}

	public void setType(PaymentType type) {
		this.type = type;
	}
	
}
