package parking;

import categories.VehicleType;
import main.Address;

public class Parking {
	
	//Details of Parking Lot
	private String id;
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
	
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

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

	private Parking() {
		
	}
	
	public static Parking getInstance() {
		if(parking == null) {
			parking = new Parking();
		}
		return parking;
	}
	
	//Check if parking if Full
	public boolean isFull(VehicleType type) {
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
	public void addSpotCount(VehicleType type) {
		if(type == VehicleType.CAR) {
			mediumCount++;
		}
		if(type == VehicleType.BIKE) {
			compactCount++;
		}
		if(type == VehicleType.TRUCK) {
			largeCount++;
		}
	}
	
	
	
}
