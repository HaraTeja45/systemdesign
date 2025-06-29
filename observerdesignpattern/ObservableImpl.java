package observerdesignpattern;

import java.util.ArrayList;
import java.util.List;

public class ObservableImpl implements ObservableInterface {

	List<SubscriberInterface> observers = new ArrayList<>();

	private Integer currStockInteger = 0;

	@Override
	public void registerSubscriber(SubscriberInterface observer) {

		observers.add(observer);

	}

	public Integer getCurrStockInteger() {
		return currStockInteger;
	}

	public void setCurrStockInteger(Integer currStockInteger) {
		this.currStockInteger = currStockInteger;
		if (currStockInteger != 0) {
			notifySubscriber();
		}

	}

	@Override
	public void notifySubscriber() {

		for (SubscriberInterface observer : observers) {

			observer.notifyCustomer();

		}

	}

}
