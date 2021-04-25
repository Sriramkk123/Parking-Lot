package paymenttypes;

import java.util.Date;

import categories.PaymentType;
import main.PaymentMethod;
import main.Ticket;

public class Cash extends PaymentMethod{
	public Cash() {
		super(PaymentType.CASH);
	}
	
	public void sendNotification() {
		//Notify owner about cash payment method
		System.out.println("Cash paid");
	}

	@Override
	public Long calculateFee(Ticket ticket) {
		Date entryTime = ticket.getTimeIssued();
		Date exitTime = new Date();
		//Use Date formatting and calculate fee
		return null;
	}


	
	
}
