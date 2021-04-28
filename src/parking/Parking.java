package parking;


import java.time.LocalDateTime;

import categories.PaymentType;
import categories.VehicleType;
import factory.PaymentFactory;
import main.Address;
import main.PaymentMethod;
import main.Ticket;
import main.Vehicle;
import paymenttypes.Cash;

public class Parking {
	
	//Details of Parking Lot
	private String name;
	private Address address;
	
	//Count of all categories of vehicles
	private int compactCount;
	private int mediumCount;
	private int largeCount;

	//Maximum capacity of each category of spots
	private int maxCompactCount;
	private int maxMediumCount;
	private int maxLargeCount;
	
	static int ticketId = 1;


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public int getCompactCount() {
		return compactCount;
	}

	public void setCompactCount(int compactCount) {
		this.compactCount = compactCount;
	}

	public int getMediumCount() {
		return mediumCount;
	}

	public void setMediumCount(int mediumCount) {
		this.mediumCount = mediumCount;
	}

	public int getLargeCount() {
		return largeCount;
	}

	public void setLargeCount(int largeCount) {
		this.largeCount = largeCount;
	}

	public int getMaxCompactCount() {
		return maxCompactCount;
	}

	public void setMaxCompactCount(int maxCompactCount) {
		this.maxCompactCount = maxCompactCount;
	}

	public int getMaxMediumCount() {
		return maxMediumCount;
	}

	public void setMaxMediumCount(int maxMediumCount) {
		this.maxMediumCount = maxMediumCount;
	}

	public int getMaxLargeCount() {
		return maxLargeCount;
	}

	public void setMaxLargeCount(int maxLargeCount) {
		this.maxLargeCount = maxLargeCount;
	}

	public static Parking getParking() {
		return parking;
	}

	public static void setParking(Parking parking) {
		Parking.parking = parking;
	}

	//This should be a Singleton class as it should contain only one object at any time
	private static Parking parking = null;

	
	public Parking() {
		
	}

	
	public static Parking getInstance() {
		if(parking == null) {
			parking = new Parking();
		}
		return parking;
	}
	
	public void addAddress(Address address) {
		this.setAddress(address);
	}
	
	//add max Parking count
	public void addParking(int maxCompactCount, int maxMediumCount,int maxLargeCount)
	{
		this.setMaxCompactCount(maxCompactCount);
		this.setMaxMediumCount(maxMediumCount);
		this.setMaxLargeCount(maxLargeCount);
	}
	
	
	//Check if parking if Full
	public synchronized boolean isFull(VehicleType type) {
		if(type == VehicleType.CAR) {
			return mediumCount >= maxMediumCount;
		}
		if(type == VehicleType.BIKE) {
			return compactCount >= maxCompactCount;
		}
		if(type == VehicleType.TRUCK) {
			return largeCount >= maxLargeCount;
		}
		return true;
	}
	
	//Add a vehicle
	public synchronized void addSpotCount(Vehicle vehicle) {
		if(vehicle.getType() == VehicleType.CAR) {
			mediumCount++;
		}
		if(vehicle.getType() == VehicleType.BIKE) {
			compactCount++;
		}
		if(vehicle.getType() == VehicleType.TRUCK) {
			largeCount++;
		}
		
		Ticket ticket = new Ticket();
		ticket.setId(ticketId++);
		ticket.setTimeIssued(LocalDateTime.now());
		vehicle.setTicket(ticket);
	}
	
	//exit from spot
	public synchronized Long removeSpotCount(Vehicle vehicle, PaymentType pType) {
		if(vehicle.getType() == VehicleType.CAR) {
			mediumCount--;
		}
		if(vehicle.getType()== VehicleType.BIKE) {
			compactCount--;
		}
		if(vehicle.getType() == VehicleType.TRUCK) {
			largeCount--;
		}
		
		PaymentFactory paymentFactory = new PaymentFactory();
		PaymentMethod paymentMethod = paymentFactory.getPaymentMethod(pType);
		Long fee = paymentMethod.calculateFee(vehicle);
		if(paymentMethod instanceof Cash)
			((Cash) paymentMethod).sendNotification();
		return fee;
	}
	
}
