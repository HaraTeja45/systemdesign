package observerdesignpattern;

public class EmailNotification implements NotificationInterface{

	@Override
	public void sendNotification(String name) {
		System.out.println("Successfully send email notification for user:"+name);
		
	}

}
