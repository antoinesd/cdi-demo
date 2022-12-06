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

public class OrderingEventTest {

    @Rule
    public WeldInitiator weld = WeldInitiator.from(OrderedObserverBean.class).inject(this).build();

    @Test
    public void eventTest() {
        Payload pl = new Payload("a payload");
        eventStr.fire(pl);
    }

    @Inject
    Event<Payload> eventStr;


}
