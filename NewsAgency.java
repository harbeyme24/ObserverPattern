package observerPattern;

import java.util.*;


public class NewsAgency implements NewsAgencySubject{

    private static List<Subscriber> subscriberList = new ArrayList<>();


    @Override
    public void subscribe(Subscriber subscriber) {
        subscriberList.add(subscriber);
    }

    @Override
    public void unsubcribe(Subscriber subscriber) {
        subscriberList.remove(subscriber);
    }

    @Override
    public void notifySubscribers(String news, String category) {
        for(Subscriber subscriber : subscriberList){
            subscriber.update(publishNews(news), category);
        }
    }

    public String publishNews(String news)
    {
        return news ;
    }
}
