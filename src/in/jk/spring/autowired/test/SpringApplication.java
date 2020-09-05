package in.jk.spring.autowired.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApplication {

	public static void main(String[] args) {

		ApplicationContext applicationContext = null;
		applicationContext =new ClassPathXmlApplicationContext("context.xml");

		MyConfiguration configuration = (MyConfiguration) applicationContext.getBean("config");

		TestBean testBean = (TestBean) applicationContext.getBean("testBean");

		testBean.printEmpoyee();

	}

}
