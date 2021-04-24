package main;

import java.util.Date;

public class Ticket {
	private String id;
	private Date timeIssued;
	
	public Ticket() {
		
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Date getTimeIssued() {
		return timeIssued;
	}
	public void setTimeIssued() {
		Date date = new Date();
		this.timeIssued = date;
	}

	@Override
	public String toString() {
		return "Ticket [id=" + id + ", timeIssued=" + timeIssued + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((timeIssued == null) ? 0 : timeIssued.hashCode());
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
		Ticket other = (Ticket) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (timeIssued == null) {
			if (other.timeIssued != null)
				return false;
		} else if (!timeIssued.equals(other.timeIssued))
			return false;
		return true;
	}
	
	
}
