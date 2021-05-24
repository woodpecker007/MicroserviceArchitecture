package com.aurora.test.dubbo;


import com.aurora.test.dubbo.spi.Driver;
import org.apache.dubbo.common.extension.ExtensionLoader;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class DubboProviderApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Test
	public void testConnect() {
		ExtensionLoader<Driver> extensionLoader = ExtensionLoader.getExtensionLoader(Driver.class);
		Driver driver = extensionLoader.getExtension("myDriver");
		System.out.println(driver.connect());
	}

}
