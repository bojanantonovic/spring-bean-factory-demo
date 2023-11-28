module spring.bean.factory.demo_test {

	requires spring.bean.factory.demo;

	// Spring dependencies
	requires spring.beans;
	requires spring.core;

	// test dependencies
	requires spring.test;
	requires org.junit.jupiter.api;
	requires org.junit.jupiter.engine;
	requires spring.context;

	// opens for JUnit
	opens demo_test to org.junit.platform.commons, spring.core;
	opens demo_test.factorymethod to org.junit.platform.commons, spring.core;
}
