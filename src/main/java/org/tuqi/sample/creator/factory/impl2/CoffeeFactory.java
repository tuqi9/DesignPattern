package org.tuqi.sample.creator.factory.impl2;

import org.tuqi.sample.creator.factory.impl1.Beverage;
import org.tuqi.sample.creator.factory.impl1.Coffee;

public class CoffeeFactory implements CompositeBeverageFactory {


    @Override
    public Beverage supply() {
        return new Coffee();
    }


}
