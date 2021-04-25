package vehicles;

import categories.VehicleType;
import main.Vehicle;

public class Bike extends Vehicle{
	public Bike() {
		super(VehicleType.BIKE);
		this.setFirstHourCharges(20L);
		this.setSecondHourCharges(10L);
		this.setLaterCharges(5L);
	}
}
