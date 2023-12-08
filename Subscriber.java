package observerPattern;

public class Subscriber implements SubscriberObserver{

    private String subscriberName;

    public String getSubscriberName() {
        return subscriberName;
    }

    public void setSubscriberName(String subscriberName) {
        this.subscriberName = subscriberName;
    }

    @Override
    public void update(String news, String category) {
        System.out.println("Hey, " + subscriberName + "! You have new updates! [News] " + news + " [Category] " + category);

    }

}
