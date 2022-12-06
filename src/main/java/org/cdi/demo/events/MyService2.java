package org.cdi.demo.events;


import jakarta.enterprise.context.RequestScoped;

/**
 * @author Antoine Sabot-Durand
 */
@RequestScoped
public class MyService2 {

    public String Hello() {
        return "Hello world";
    }

}
