package org.cdi.demo;



import jakarta.enterprise.event.Event;
import jakarta.inject.Inject;
import org.cdi.demo.events.Payload;
import org.jboss.weld.junit4.WeldInitiator;
import org.junit.Rule;
import org.junit.Test;

/**
 * Created by antoine on 24/10/2015.
 */


public class AsynchronousEventTest {


    @Rule
    public WeldInitiator weld = WeldInitiator.from(AsynchronousObserverBean.class).inject(this).build();

    @Test
    public void eventTest() {
        Payload pl = new Payload("a payload");
        eventStr
                .fireAsync(pl)
                .thenRun(() -> System.out.println("**** I run once the observers have been called"))
                .exceptionally(t -> {
                    System.out.println("Exception thrown: " + t.getMessage());
                    return null;
                });


        System.out.println("\n\n*** Just After fire");
    }

    @Inject
    Event<Payload> eventStr;


}
