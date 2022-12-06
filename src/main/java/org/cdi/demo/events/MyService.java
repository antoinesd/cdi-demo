package org.cdi.demo.events;


import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.control.ActivateRequestContext;
import jakarta.inject.Inject;
import jakarta.annotation.PostConstruct;

/**
 * Created by antoine on 25/10/2015.
 */
@ApplicationScoped
public class MyService {

    @Inject
    MyService2 myService2;


    @ActivateRequestContext
    public void sayHello() {
        System.out.println("Say " + myService2.Hello());
    }

    @PostConstruct
    public void init() {
        System.out.println("!!!!!!!  Init !!!!!!!!");
    }


}
