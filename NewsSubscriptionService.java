package observerPattern;

import java.util.*;

public class NewsSubscriptionService {
    public static void main(String[] args) {


        NewsAgency newsAgency = new NewsAgency();

        System.out.println("Welcome to NET 25 Agency!\n");

        //Creating Objects

        Subscriber harbey = new Subscriber();
        noriel.setSubscriberName("Harbey");

        Subscriber manuel = new Subscriber();
        leiron.setSubscriberName("Manuel");

        Subscriber edroso = new Subscriber();
        achero.setSubscriberName("Edroso");

        Subscriber ladignon = new Subscriber();
        orecha.setSubscriberName("Ladignon");

        //Subscribing Objects

        newsAgency.subscribe(harbey);
        newsAgency.subscribe(manuel);
        newsAgency.subscribe(edroso);
        newsAgency.subscribe(ladignon);

        //Notifying the Subscribers

        System.out.println("Here are news for these subscribers!\n");
        newsAgency.notifySubscribers("E.A.T. Bulaga", "Celebrity");//Flexibility for adding updated news and its category


        //Unsubscribing Objects
        newsAgency.unsubcribe(harbey);
        newsAgency.unsubcribe(edroso);

        //Notifying the Subscribers

        System.out.println("\nHere are news for these subscribers!\n");
        newsAgency.notifySubscribers("Lumindol yumanig nakakatakot!", "Calamity");//Flexibility for adding updated news and its category

        Subscriber Sofia = new Subscriber();
        John.setSubscriberName("Sofia");

        newsAgency.subscribe(Sofia);

        System.out.println("\nHere are news for these subscribers!\n");
        newsAgency.notifySubscribers("Apple releases IPad Pro M3", "Technology");//Flexibility for adding updated news and its category




    }
}
