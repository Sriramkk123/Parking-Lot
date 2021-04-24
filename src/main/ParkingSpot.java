package main;

import categories.ParkingType;

public class ParkingSpot {
	private String id;
	private boolean isFree;
	private ParkingType type;
	private Vehicle vehicle;
	
	
	public ParkingSpot(ParkingType type) {
		this.type = type;
	}
	
	public boolean isFree()
	{
		return this.isFree;
	}
	
	public void addVehicleToSpot(Vehicle vehicle) {
		this.vehicle = vehicle;
		isFree = false;
	}

	public void removeVehicleFromSpot(Vehicle vehicle) {
		this.vehicle = null;
		isFree = true;
	}
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public ParkingType getType() {
		return type;
	}

	public void setType(ParkingType type) {
		this.type = type;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public void setFree(boolean isFree) {
		this.isFree = isFree;
	}

	@Override
	public String toString() {
		return "ParkingSpot [id=" + id + ", isFree=" + isFree + ", type=" + type + ", vehicle=" + vehicle + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + (isFree ? 1231 : 1237);
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result + ((vehicle == null) ? 0 : vehicle.hashCode());
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
		ParkingSpot other = (ParkingSpot) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (isFree != other.isFree)
			return false;
		if (type != other.type)
			return false;
		if (vehicle == null) {
			if (other.vehicle != null)
				return false;
		} else if (!vehicle.equals(other.vehicle))
			return false;
		return true;
	}
	
	
	
}
