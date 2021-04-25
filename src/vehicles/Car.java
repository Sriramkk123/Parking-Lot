package vehicles;

import categories.VehicleType;
import main.Vehicle;

public class Car extends Vehicle{

	public Car() {
		super(VehicleType.CAR);
		this.setFirstHourCharges(30L);
		this.setSecondHourCharges(20L);
		this.setLaterCharges(10L);
	}

}
