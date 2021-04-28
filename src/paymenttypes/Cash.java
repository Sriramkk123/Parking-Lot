package paymenttypes;

import java.time.Duration;
import java.time.LocalDateTime;

import categories.PaymentType;
import main.PaymentMethod;
import main.Vehicle;

public class Cash extends PaymentMethod{
	public Cash() {
		super(PaymentType.CASH);
	}
	
	public void sendNotification() {
		//Notify owner about cash payment method
		System.out.println("Cash paid");
	}

	@Override
	public Long calculateFee(Vehicle vehicle) {
		vehicle.getTicket().setTimeExited(LocalDateTime.now());
		LocalDateTime entryTime = null;
		LocalDateTime exitTime = null;
		entryTime = vehicle.getTicket().getTimeIssued();
		exitTime = vehicle.getTicket().getTimeExited();
		if(entryTime != null && exitTime != null){
			Long paymentAmount = 0L;
			Duration duration = Duration.between(entryTime, exitTime);
			Long difference = duration.toHours();
			if(difference == 0)
			{
				paymentAmount += vehicle.getParkingFee().getFirstHourCharges();
				return paymentAmount;
			}
			else if(difference == 1)
			{
				paymentAmount += vehicle.getParkingFee().getFirstHourCharges() + vehicle.getParkingFee().getSecondHourCharges();
				return paymentAmount;
			}
			else if(difference > 1)
			{
				paymentAmount += vehicle.getParkingFee().getFirstHourCharges() + vehicle.getParkingFee().getSecondHourCharges() + (difference - 1)*vehicle.getParkingFee().getLaterCharges();
				return paymentAmount;
			}
		}
		return null;
	}


	
	
}
