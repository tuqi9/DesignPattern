package org.tuqi.sample.structural.decorator;

public class Main {

    public static void main(String[] args) {
        System.out.println("Default invoke");
        Service defaultService = new DefaultService();
        defaultService.doService();


        System.out.println();
        System.out.println("====================Decorator===================");
        //  装饰器模式,在不修改原本代码情况下增加一个计数功能
        ServiceDecorator additionalService = new AdditionalService();
        additionalService.setService(defaultService);
        additionalService.doService();
    }

}
