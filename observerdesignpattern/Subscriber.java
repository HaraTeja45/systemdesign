package observerdesignpattern;

public class Subscriber implements SubscriberInterface {

	private String name;

	private NotificationInterface notificationInterface;

	public Subscriber(String nam̰e, NotificationInterface notificationInterface) {

		this.name = nam̰e;
		this.notificationInterface = notificationInterface;

	}

	@Override
	public void notifyCustomer() {

		notificationInterface.sendNotification(name);

	}

}
