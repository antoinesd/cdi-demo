package org.cdi.demo;



import jakarta.enterprise.inject.se.SeContainer;
import jakarta.enterprise.inject.se.SeContainerInitializer;
import org.cdi.demo.events.MyService;
import org.cdi.demo.events.MyService2;

/**
 * Created by antoine on 24/10/2015.
 */
public class JavaSETest {

    public static void main(String[] args) {

        SeContainer container = SeContainerInitializer
                .newInstance()
                .disableDiscovery()
                .addBeanClasses(MyService.class, MyService2.class)
                .initialize();


        MyService service = container.select(MyService.class).get();

        service.sayHello();

        container.close();

    }

}
