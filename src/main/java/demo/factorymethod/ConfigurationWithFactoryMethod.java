package demo.factorymethod;

import demo.A;
import demo.BPojo;
import demo.BWithConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationWithFactoryMethod {

	@Bean
	A createA() {
		return new A();
	}

	@Bean
	BPojo createBPojo(final A a) {
		final var bPojo = new BPojo();
		bPojo.setA(a);
		return bPojo;
	}

	@Bean
	BWithConstructor createBWithConstructor(final A a) {
		return new BWithConstructor(a);
	}
}
