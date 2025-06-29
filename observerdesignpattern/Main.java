package observerdesignpattern;

public class Main {
	public static void main(String[] args) {

		ObservableImpl observableImpl = new ObservableImpl();

		NotificationInterface emailInterface = new EmailNotification();

		NotificationInterface smsInterface = new SMSNotification();

		SubscriberInterface observer = new Subscriber("test", emailInterface);

		SubscriberInterface observer2 = new Subscriber("Hi", smsInterface);

		observableImpl.registerSubscriber(observer);
		observableImpl.registerSubscriber(observer2);

		observableImpl.setCurrStockInteger(1);

	}
}
