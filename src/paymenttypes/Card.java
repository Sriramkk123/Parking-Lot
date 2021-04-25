package paymenttypes;

import java.util.Date;

import categories.PaymentType;
import main.PaymentMethod;
import main.Ticket;

public class Card extends PaymentMethod{
	
	public Card(){
		super(PaymentType.CARD);
	}

	@Override
	public Long calculateFee(Ticket ticket) {
		Date entryTime = ticket.getTimeIssued();
		Date exitTime = new Date();
	
		return null;
	}
}
