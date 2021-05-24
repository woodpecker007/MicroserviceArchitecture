package com.aurora.test.dubbo.spi;

import org.apache.dubbo.common.extension.ExtensionLoader;

import java.util.ServiceLoader;

public class SpiMain {

    public static void main(String[] args) {
        // JDK内置SPI写法
//        ServiceLoader<Driver> serviceLoader = ServiceLoader.load(Driver.class);
//        serviceLoader.forEach(driver -> System.out.println(driver.connect()));

        // Dubbo spi验证
        ExtensionLoader<Driver> extensionLoader = ExtensionLoader.getExtensionLoader(Driver.class);
        Driver driver = extensionLoader.getExtension("myDriver");
//        Driver driver = extensionLoader.getDefaultExtension();
        System.out.println(driver.connect());
    }
}
