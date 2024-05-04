package org.tuqi.sample.structural.decorator;

public class ServiceDecorator implements Service {

    protected Service service;

    public void setService(Service service) {
        this.service = service;
    }

    @Override
    public void doService() {
        if (service != null) {
            service.doService();
        }
    }
}
