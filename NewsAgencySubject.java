package observerPattern;

public interface NewsAgencySubject {
    public void subscribe(Subscriber subscriber);
    public void unsubcribe(Subscriber subscriber);

    void notifySubscribers(String news, String category);
}
