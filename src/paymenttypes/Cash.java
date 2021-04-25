package paymenttypes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import categories.PaymentType;
import main.PaymentMethod;
import main.Ticket;
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
		SimpleDateFormat format = new SimpleDateFormat();
		Date entryTime = null;
		Date exitTime = null;
		try {
			entryTime = format.parse(vehicle.getTicket().getTimeIssued().toString());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		try {
			exitTime = format.parse(new Date().toString());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		if(entryTime != null && exitTime != null){
			Long paymentAmount = 0L;
			Long difference = (long) (exitTime.getHours() - entryTime.getHours());
			if(difference == 0)
			{
				paymentAmount += vehicle.getFirstHourCharges();
				return paymentAmount;
			}
			else if(difference == 1)
			{
				paymentAmount += vehicle.getFirstHourCharges() + vehicle.getSecondHourCharges();
			}
			else if(difference > 1)
			{
				paymentAmount += vehicle.getFirstHourCharges() + vehicle.getSecondHourCharges() + (difference - 2)*vehicle.getLaterCharges();
				return paymentAmount;
			}
		}
		return null;
	}


	
	
}
