package org.cdi.demo;

import java.util.concurrent.Executor;

/**
 * Created by antoine on 26/10/2015.
 */
public enum ExecutorEnum implements Executor {

    ONE {
        @Override
        public void execute(Runnable command) {

        }
    }
}
