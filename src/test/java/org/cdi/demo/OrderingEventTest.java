package org.cdi.demo;

import jakarta.enterprise.event.Event;
import jakarta.inject.Inject;

import org.cdi.demo.events.Payload;
import org.jboss.weld.junit5.WeldInitiator;
import org.jboss.weld.junit5.WeldJunit5Extension;
import org.jboss.weld.junit5.WeldSetup;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

/**
 * Created by antoine on 24/10/2015.
 */
@ExtendWith(WeldJunit5Extension.class)
public class OrderingEventTest {


    @WeldSetup
    public WeldInitiator weld = WeldInitiator.from(OrderedObserverBean.class).inject(this).build();

    @Test
    public void eventTest() {
        Payload pl = new Payload("a payload");
        eventStr.fire(pl);
    }

    @Inject
    Event<Payload> eventStr;


}
