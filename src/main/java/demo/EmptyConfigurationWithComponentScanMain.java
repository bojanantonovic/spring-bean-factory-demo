package demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

// configuration is outside the class
public class EmptyConfigurationWithComponentScanMain {

	public static void main(String... args) {
		try (final var context = new AnnotationConfigApplicationContext(EmptyConfigurationWithComponentScan.class)) {
			// fetch by type
			final A a = context.getBean(A.class);
			System.out.println(a);

			// fetch by id
			final A a2 = (A) context.getBean("createA");
			System.out.println(a2);

			final BPojo bPojo = context.getBean(BPojo.class);
			System.out.println(bPojo);
			System.out.println(bPojo.a);

			final BWithConstructor bWithConstructor = context.getBean(BWithConstructor.class);
			System.out.println(bWithConstructor);
			System.out.println(bWithConstructor.a);
		}
	}
}
