package parkingfeetypes;

import main.ParkingFee;

public class CarFee extends ParkingFee{

	public CarFee() {
		this.setFirstHourCharges(30L);
		this.setSecondHourCharges(20L);
		this.setLaterCharges(10L);
	}
}
