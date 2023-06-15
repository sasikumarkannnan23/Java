package myfirst;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext();
		Welcome  wel = (Welcome)context.getBean("wel"); // Dependency injection
		wel.sayHi();

	}

}
