package observerPattern;

import java.util.*;

public class NewsSubscriptionService {
    public static void main(String[] args) {


        NewsAgency newsAgency = new NewsAgency();

        System.out.println("Welcome to 24 Oras News Agency!\n");

        //Creating Objects

        Subscriber noriel = new Subscriber();
        noriel.setSubscriberName("Noriel");

        Subscriber leiron = new Subscriber();
        leiron.setSubscriberName("leiron");

        Subscriber achero = new Subscriber();
        achero.setSubscriberName("achero");

        Subscriber orecha = new Subscriber();
        orecha.setSubscriberName("orecha");

        //Subscribing Objects

        newsAgency.subscribe(noriel);
        newsAgency.subscribe(leiron);
        newsAgency.subscribe(achero);
        newsAgency.subscribe(orecha);

        //Notifying the Subscribers

        System.out.println("Here are news for these subscribers!\n");
        newsAgency.notifySubscribers("Kathniel broke up", "Celebrity");//Flexibility for adding updated news and its category


        //Unsubscribing Objects
        newsAgency.unsubcribe(noriel);
        newsAgency.unsubcribe(achero);

        //Notifying the Subscribers

        System.out.println("\nHere are news for these subscribers!\n");
        newsAgency.notifySubscribers("Lumindol kaninang hapon!", "Calamity");//Flexibility for adding updated news and its category

        Subscriber John = new Subscriber();
        John.setSubscriberName("John");

        newsAgency.subscribe(John);

        System.out.println("\nHere are news for these subscribers!\n");
        newsAgency.notifySubscribers("Iphone releases Iphone 16", "Technology");//Flexibility for adding updated news and its category




    }
}
