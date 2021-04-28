package parkingfeetypes;

import main.ParkingFee;

public class TruckFee extends ParkingFee{
	public TruckFee() {
		this.setFirstHourCharges(40L);
		this.setSecondHourCharges(30L);
		this.setLaterCharges(15L);
	}
}
