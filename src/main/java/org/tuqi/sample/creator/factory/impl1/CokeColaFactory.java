package org.tuqi.sample.creator.factory.impl1;

public class CokeColaFactory implements BeverageFactory {

    @Override
    public Beverage supply() {
        return new CokeCola();
    }
}
