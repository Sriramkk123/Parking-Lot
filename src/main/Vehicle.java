package main;

import categories.VehicleType;

public abstract class Vehicle {
<<<<<<< HEAD
	private String registrationNumber;
=======
	private String name;
>>>>>>> d2f37cb19a478fed66870c7a85dfda1258e9aef2
	private VehicleType type;
	private Ticket ticket;
	
	public Vehicle(VehicleType type) {
		super();
		this.type = type;
	}


<<<<<<< HEAD
	public String getRegistrationNumber() {
		return registrationNumber;
	}


	public void setRegistrationNumber(String registrationNumbe) {
		this.registrationNumber = registrationNumbe;
=======
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
>>>>>>> d2f37cb19a478fed66870c7a85dfda1258e9aef2
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
<<<<<<< HEAD
		return "Vehicle [name=" + registrationNumber + ", type=" + type + ", ticket=" + ticket + "]";
=======
		return "Vehicle [name=" + name + ", type=" + type + ", ticket=" + ticket + "]";
>>>>>>> d2f37cb19a478fed66870c7a85dfda1258e9aef2
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
<<<<<<< HEAD
		result = prime * result + ((registrationNumber == null) ? 0 : registrationNumber.hashCode());
=======
		result = prime * result + ((name == null) ? 0 : name.hashCode());
>>>>>>> d2f37cb19a478fed66870c7a85dfda1258e9aef2
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
<<<<<<< HEAD
		if (registrationNumber == null) {
			if (other.registrationNumber != null)
				return false;
		} else if (!registrationNumber.equals(other.registrationNumber))
=======
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
>>>>>>> d2f37cb19a478fed66870c7a85dfda1258e9aef2
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
