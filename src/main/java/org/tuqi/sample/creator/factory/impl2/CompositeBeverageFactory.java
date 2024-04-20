package org.tuqi.sample.creator.factory.impl2;

import org.tuqi.sample.creator.factory.impl1.Beverage;
import org.tuqi.sample.creator.util.ReflectionUtil;
import org.tuqi.sample.creator.util.XMLUtil;

/**
 * 工厂模式的具体接口
 * 第二种工厂方法实现，通过与要生成的对象组合，实现面对接口编程
 */
public interface CompositeBeverageFactory extends Beverage {


    Beverage supply();

    @Override
    default void drink() {
        Beverage beverage = supply();
        beverage.drink();
    }

    static CompositeBeverageFactory getFactory() {
        String beverageProvider = XMLUtil.getProperty("beverageProviderClass");
        Object instance = ReflectionUtil.instance(beverageProvider);

        if (instance instanceof CompositeBeverageFactory) {
            return (CompositeBeverageFactory) instance;
        }
        return null;
    }

}
