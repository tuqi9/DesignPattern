package org.tuqi.sample.creator.factory.impl1;

public class CoffeeFactory implements BeverageFactory {

    @Override
    public Beverage supply() {
        return new Coffee();
    }
}
