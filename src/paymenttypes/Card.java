package paymenttypes;

import categories.PaymentType;
import main.PaymentMethod;

public class Card extends PaymentMethod{
	
	public Card(){
		super(PaymentType.CARD);
	}

	@Override
	public Long calculateFee() {
		return null;
	}
}
