package factory;

import categories.VehicleType;
import main.Vehicle;
import vehicles.Bike;
import vehicles.Car;
import vehicles.Truck;

public class VehicleFactory {
	
	public Vehicle getVehicle(VehicleType type)
	{
		if(type == null) {
			return null;
		}
		
		if(type == VehicleType.BIKE) {
			return new Bike();
		}
		
		else if(type == VehicleType.CAR) {
			return new Car();
		}
		
		else if(type == VehicleType.TRUCK) {
			return new Truck();
		}
		return null;
	}
}
