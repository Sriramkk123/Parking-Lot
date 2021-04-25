package tests;
import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

import categories.VehicleType;
import main.Address;
import main.Ticket;
import main.Vehicle;
import parking.Parking;
import vehicles.Car;

public class Test1 {

	@Test
	public void test() {
		Parking parking = new Parking();
		parking.setId("1");
		parking.setName("ABC parking");
		
		
		
		Address address = new Address();
		address.setStreet("1st main");
		address.setLandmark("Indoor Stadium");
		address.setCity("Bangalore");
		address.setState("Karnataka");
		address.setZipcode("573202");
		parking.setAddress(address);
		
		parking.setMaxCompactCount(2);
		parking.setMaxMediumCount(3);
		parking.setMaxLargeCount(2);
		
		Vehicle vehicle = new Car();
		vehicle.setRegistrationNumber("ABC 123");
		vehicle.setName("Maruti 800");
		vehicle.setType(VehicleType.CAR);
	
		if(!parking.isFull(vehicle.getType())) {
			Ticket ticket = new Ticket();
			ticket.setId("1");
			Date date = new Date();
			ticket.setTimeIssued(date);
			parking.addSpotCount(vehicle);
		}
		
		
	}

}
