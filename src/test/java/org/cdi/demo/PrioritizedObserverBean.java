package org.cdi.demo;

import jakarta.enterprise.event.Observes;

import org.cdi.demo.events.Payload;

/**
 * Created by antoine on 24/10/2015.
 */
public class PrioritizedObserverBean {


    public void observer(@Observes Payload payload) throws InterruptedException {
        System.out.println("\n*** I'm observer 1");

    }


}
