package observerdesignpattern;

public interface ObservableInterface {
	
	public void registerSubscriber(SubscriberInterface subscriber);
	
	public void notifySubscriber();
}
