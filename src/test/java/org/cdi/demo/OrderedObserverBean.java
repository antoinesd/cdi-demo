package org.cdi.demo;

import jakarta.enterprise.event.Observes;

import org.cdi.demo.events.Payload;


public class OrderedObserverBean {


    public void observerA(@Observes Payload payload) {
        System.out.println("***** I'm the 1st event");
    }

    public void observerB(@Observes Payload payload) {
        System.out.println("***** I'm the 2nd event");
    }

    public void observerC(@Observes Payload payload) {
        System.out.println("***** I'm the 3rd event");
    }

    public void observerD(@Observes Payload payload) {
        System.out.println("***** I'm the 4th event");
    }


}
