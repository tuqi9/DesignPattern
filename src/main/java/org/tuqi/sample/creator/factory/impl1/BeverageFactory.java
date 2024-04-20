package org.tuqi.sample.creator.factory.impl1;

import org.tuqi.sample.creator.util.ReflectionUtil;
import org.tuqi.sample.creator.util.XMLUtil;

/**
 * 饮料供应商,也可以起名叫 BeverageProvider
 * 专门用于提供饮料
 *
 * 工厂模式的具体接口
 */
public interface BeverageFactory {


    Beverage supply();

    static BeverageFactory getFactory() {
        String beverageProvider = XMLUtil.getProperty("beverageProviderClass");
        Object instance = ReflectionUtil.instance(beverageProvider);

        if (instance instanceof BeverageFactory) {
            return (BeverageFactory) instance;
        }
        return null;
    }

}
