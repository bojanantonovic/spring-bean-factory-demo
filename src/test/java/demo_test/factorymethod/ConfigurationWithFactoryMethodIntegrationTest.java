package demo_test.factorymethod;

import demo.A;
import demo.BPojo;
import demo.BWithConstructor;
import demo.EmptyConfigurationWithComponentScan;
import demo.factorymethod.ConfigurationWithFactoryMethod;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig(ConfigurationWithFactoryMethod.class)
class ConfigurationWithFactoryMethodIntegrationTest {

	@Autowired
	private A a;

	@Autowired
	private BPojo bPojo;

	@Autowired
	private BWithConstructor bWithConstructor;

	@Test
	void testA() {
		Assertions.assertNotNull(a);

		System.out.println("a:" + a);
	}

	@Test
	void testBPojo() {
		Assertions.assertNotNull(bPojo);
		Assertions.assertNotNull(bPojo.a);

		System.out.println(bPojo);
		System.out.println(bPojo.a);
	}

	@Test
	void testBWithConstructor() {
		Assertions.assertNotNull(bWithConstructor);
		Assertions.assertNotNull(bWithConstructor.a);

		System.out.println(bWithConstructor);
		System.out.println(bWithConstructor.a);
	}
}
