package main;

public class ParkingFee {
	
	
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
	@Override
	public String toString() {
		return "ParkingFee [firstHourCharges=" + firstHourCharges + ", secondHourCharges=" + secondHourCharges
				+ ", laterCharges=" + laterCharges + "]";
	}
	
	
}
