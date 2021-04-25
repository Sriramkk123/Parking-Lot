package vehicles;

import categories.VehicleType;
import main.Vehicle;

public class Truck extends Vehicle{
	public Truck() {
		super(VehicleType.TRUCK);
		this.setFirstHourCharges(40L);
		this.setSecondHourCharges(30L);
		this.setLaterCharges(15L);
	}
}
