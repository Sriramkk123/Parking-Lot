package factory;

import categories.VehicleType;
import main.ParkingFee;
import parkingfeetypes.BikeFee;
import parkingfeetypes.CarFee;
import parkingfeetypes.TruckFee;

public class ParkingFeeFactory {
	public ParkingFee getParkingFee(VehicleType type) {
		if(type == null) {
			return null;
		}
		
		if(type == VehicleType.BIKE) {
			return new BikeFee();
		}
		
		else if(type == VehicleType.CAR) {
			return new CarFee();
		}
		
		else if(type == VehicleType.TRUCK) {
			return new TruckFee();
		}
		return null;
	}
}
