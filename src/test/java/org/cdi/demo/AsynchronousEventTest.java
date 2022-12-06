package org.cdi.demo;



import jakarta.enterprise.event.Event;
import jakarta.inject.Inject;
import org.cdi.demo.events.Payload;
import org.jboss.weld.junit5.WeldInitiator;
import org.jboss.weld.junit5.WeldJunit5Extension;
import org.jboss.weld.junit5.WeldSetup;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

/**
 * Created by antoine on 24/10/2015.
 */

@ExtendWith(WeldJunit5Extension.class)
public class AsynchronousEventTest {


    @WeldSetup
    public WeldInitiator weld = WeldInitiator.from(AsynchronousObserverBean.class).build();

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
