package observerdesignpattern;

public class SMSNotification implements NotificationInterface {

	@Override
	public void sendNotification(String name) {

		System.out.println("Successfully sent sms for user: " + name);

	}

}
