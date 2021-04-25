package main;

import categories.VehicleType;

public abstract class Vehicle {

	private String registrationNumber;

	private String name;

	private VehicleType type;
	private Ticket ticket;
	
	private Long firstHourCharges;
	private Long secondHourCharges;
	private Long laterCharges;
	
	
	
	public Long getFirstHourCharges() {
		return firstHourCharges;
	}
	
	public void setFirstHourCharges(Long firstHourCharges) {
		this.firstHourCharges = firstHourCharges;
	}
	
	public Long getSecondHourCharges() {
		return secondHourCharges;
	}
	
	public void setSecondHourCharges(Long secondHourCharges) {
		this.secondHourCharges = secondHourCharges;
	}
	
	public Long getLaterCharges() {
		return laterCharges;
	}
	
	public void setLaterCharges(Long laterCharges) {
		this.laterCharges = laterCharges;
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
				+ ticket + ", firstHourCharges=" + firstHourCharges + ", secondHourCharges=" + secondHourCharges
				+ ", laterCharges=" + laterCharges + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((firstHourCharges == null) ? 0 : firstHourCharges.hashCode());
		result = prime * result + ((laterCharges == null) ? 0 : laterCharges.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((registrationNumber == null) ? 0 : registrationNumber.hashCode());
		result = prime * result + ((secondHourCharges == null) ? 0 : secondHourCharges.hashCode());
		result = prime * result + ((ticket == null) ? 0 : ticket.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		Vehicle other = (Vehicle) obj;
		if (firstHourCharges == null) {
			if (other.firstHourCharges != null)
				return false;
		} else if (!firstHourCharges.equals(other.firstHourCharges))
			return false;
		if (laterCharges == null) {
			if (other.laterCharges != null)
				return false;
		} else if (!laterCharges.equals(other.laterCharges))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (registrationNumber == null) {
			if (other.registrationNumber != null)
				return false;
		} else if (!registrationNumber.equals(other.registrationNumber))
			return false;
		if (secondHourCharges == null) {
			if (other.secondHourCharges != null)
				return false;
		} else if (!secondHourCharges.equals(other.secondHourCharges))
			return false;
		if (ticket == null) {
			if (other.ticket != null)
				return false;
		} else if (!ticket.equals(other.ticket))
			return false;
		if (type != other.type)
			return false;
		return true;
	}


	
	
	
}
