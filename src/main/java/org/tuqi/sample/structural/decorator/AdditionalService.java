package org.tuqi.sample.structural.decorator;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * the DefaultService extension to count times of invoke.
 */
public class AdditionalService extends ServiceDecorator {

    private AtomicInteger count;

    public AdditionalService() {
        this.count = new AtomicInteger(0);
    }

    @Override
    public void doService() {
        super.doService();
        count.incrementAndGet();
        System.out.println("DefaultService:" + count.get());
    }
}
