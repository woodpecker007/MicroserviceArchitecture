package com.aurora.test.dubbo.spi;

import org.apache.dubbo.common.extension.SPI;

@SPI
public interface Driver {
    String connect();
}
