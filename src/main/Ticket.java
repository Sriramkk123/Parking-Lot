package main;

import java.time.LocalDateTime;

public class Ticket {
	private int id;
	private LocalDateTime timeIssued;
	private LocalDateTime timeExited;
	
	public Ticket() {
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public LocalDateTime getTimeIssued() {
		return timeIssued;
	}
	public void setTimeIssued(LocalDateTime timeIssued) {
		this.timeIssued = timeIssued;
	}
	

	public LocalDateTime getTimeExited() {
		return timeExited;
	}

	public void setTimeExited(LocalDateTime timeExited) {
		this.timeExited = timeExited;
	}

	

	@Override
	public String toString() {
		return "Ticket [id=" + id + ", timeIssued=" + timeIssued + ", timeExited=" + timeExited + "]";
	}

	
}
