package com.aurora.test.dubbo.spi;

public class MyDriver implements Driver {
    @Override
    public String connect() {
        return "连接数据库";
    }
}
