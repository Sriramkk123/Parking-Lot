package main;

import categories.VehicleType;

public abstract class Vehicle {

	private String registrationNumber;

	private String name;

	private VehicleType type;
	private Ticket ticket;
	private ParkingFee parkingFee;
	
	
	
	public ParkingFee getParkingFee() {
		return parkingFee;
	}

	public void setParkingFee(ParkingFee parkingFee) {
		this.parkingFee = parkingFee;
	}

	public Vehicle(VehicleType type) {
		super();
		this.type = type;
	}
	
	public String getRegistrationNumber() {
		return registrationNumber;
	}


	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public VehicleType getType() {
		return type;
	}


	public void setType(VehicleType type) {
		this.type = type;
	}


	public Ticket getTicket() {
		return ticket;
	}


	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}

	@Override
	public String toString() {
		return "Vehicle [registrationNumber=" + registrationNumber + ", name=" + name + ", type=" + type + ", ticket="
				+ ticket + ", firstHourCharges=" + "]";
	}
	
	
}
