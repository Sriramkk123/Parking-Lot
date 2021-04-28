package parkingfeetypes;

import main.ParkingFee;

public class BikeFee extends ParkingFee{
	public BikeFee() {
		this.setFirstHourCharges(20L);
		this.setSecondHourCharges(10L);
		this.setLaterCharges(5L);
	}
}
