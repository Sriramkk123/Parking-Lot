package paymenttypes;

import categories.PaymentType;
import main.PaymentMethod;

public class Cash extends PaymentMethod{
	public Cash() {
		super(PaymentType.CASH);
	}

	@Override
	public Long calculateFee() {
		return null;
	}
	
	
}
