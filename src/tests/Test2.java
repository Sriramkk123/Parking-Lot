package tests;

import static org.junit.Assert.*;

import java.time.LocalDateTime;

import org.junit.Test;

import categories.PaymentType;
import categories.VehicleType;
import factory.ParkingFeeFactory;
import factory.VehicleFactory;
import main.Address;
import main.Vehicle;
import parking.Parking;

public class Test2 {

	@Test
	public void test() {
		
		Parking parking = new Parking();
		parking.setName("ABC parking");
		
		
		Address address = new Address();
		address.setStreet("1st main");
		address.setLandmark("Indoor Stadium");
		address.setCity("Bangalore");
		address.setState("Karnataka");
		address.setZipcode("573202");
		
		
		parking.addAddress(address);
		parking.addParking(2,3,2);
		
		
		
		VehicleFactory vehicleFactory = new VehicleFactory();
		ParkingFeeFactory parkingFeeFactory = new ParkingFeeFactory();
		Vehicle vehicle = vehicleFactory.getVehicle(VehicleType.TRUCK);
		if(vehicle == null)
		{
			System.out.println("Vehicle not allowed");
		}
		
		
		vehicle.setRegistrationNumber("ABC 123");
		vehicle.setName("Maruti 800");
		vehicle.setType(VehicleType.TRUCK);
		vehicle.setParkingFee(parkingFeeFactory.getParkingFee(vehicle.getType()));
		if(!parking.isFull(vehicle.getType())) {
			parking.addSpotCount(vehicle);
			vehicle.getTicket().setTimeIssued(LocalDateTime.of(2021,4,23,12,00,00));
			vehicle.getTicket().setTimeExited(LocalDateTime.of(2021,4,23,14,02,00));
			Long fee = parking.removeSpotCount(vehicle, PaymentType.CASH);
			if(fee == null)
			{
				System.out.println("Error in calculating fee");
			}
			assertTrue(fee == 85L);
		}
	}

}
