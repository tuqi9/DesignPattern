package org.tuqi.sample.structural.decorator;

public class DefaultService implements Service{

    @Override
    public void doService() {
        System.out.println("The service default behavior");
    }
}
