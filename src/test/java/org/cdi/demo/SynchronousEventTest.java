package org.cdi.demo;

import jakarta.enterprise.event.Event;
import jakarta.inject.Inject;

import org.cdi.demo.events.Payload;
import org.jboss.weld.junit5.WeldInitiator;
import org.jboss.weld.junit5.WeldSetup;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.jboss.weld.junit5.WeldJunit5Extension;


/**
 * Created by antoine on 24/10/2015.
 */

@ExtendWith(WeldJunit5Extension.class)
public class SynchronousEventTest {


    @WeldSetup
    public WeldInitiator weld = WeldInitiator.from(SynchronousObserverBean.class).build();


    @Test
    public void eventTest() {
        Payload pl = new Payload("a payload");
        eventStr.fire(pl);
        System.out.println("\n\n*** Just After fire");
    }

    @Inject
    Event<Payload> eventStr;


}
