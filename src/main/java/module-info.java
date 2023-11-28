module spring.bean.factory.demo {

	exports demo;
	exports demo.factorymethod;

	requires spring.beans;
	requires spring.context;
	requires spring.core;

	opens demo to spring.core;
	opens demo.factorymethod to spring.core;
}
