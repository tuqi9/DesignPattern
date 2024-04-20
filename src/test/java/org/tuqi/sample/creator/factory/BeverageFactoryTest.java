package org.tuqi.sample.creator.factory;

import org.junit.Test;
import org.tuqi.sample.creator.factory.impl1.Beverage;
import org.tuqi.sample.creator.factory.impl1.BeverageFactory;
import org.tuqi.sample.creator.factory.impl2.CompositeBeverageFactory;

public class BeverageFactoryTest {

    @Test
    public void testFactory1(){
        //  根据配置文件动态切换factory
        BeverageFactory factory = BeverageFactory.getFactory();
        if (factory != null) {
            //  喝饮料
            Beverage beverage = factory.supply();
            beverage.drink();
        }
    }

    @Test
    public void testFactory2(){
        CompositeBeverageFactory.getFactory().drink();
    }

}