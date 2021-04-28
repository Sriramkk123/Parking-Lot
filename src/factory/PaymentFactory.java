package factory;

import categories.PaymentType;
import main.PaymentMethod;
import paymenttypes.Card;
import paymenttypes.Cash;

public class PaymentFactory {

	
	public PaymentMethod getPaymentMethod(PaymentType type) {
		if(type == null) {
			return null;
		}
		
		if(type == PaymentType.CASH) {
			return new Cash();
		}
		
		else if(type == PaymentType.CARD) {
			return new Card();
		}
		return null;
	}
}
