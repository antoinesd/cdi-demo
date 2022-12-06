package org.cdi.demo;

import jakarta.enterprise.event.Observes;

import org.cdi.demo.events.Payload;

/**
 * Created by antoine on 24/10/2015.
 */
public class SynchronousObserverBean {


    public void observer(@Observes Payload payload) throws InterruptedException {
        System.out.println("\n*** sync observer starting in thread:" + Thread.currentThread().getName() + " and waiting 5 seconds");
        Thread.sleep(5000l);
        System.out.println("*** sync observer over");
    }

    public void anOtherobserver(@Observes Payload payload) throws InterruptedException {
        System.out.println("\n*** An other sync observer starting in thread:" + Thread.currentThread().getName());
        payload.content = "Modified";
        System.out.println("*** other sync observer over");
        //throw new NullPointerException("OOPS");
    }


}
