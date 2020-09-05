package in.jk.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringApplication {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
		System.out.println("Spring Config initilize :: ");
		User user = (User) applicationContext.getBean("user");

		user.setUserId(1);
		user.setUserName("jk");
		user.setEmail("jk@gmail.com");
		user.setPassword("jk123");
		System.out.println(user);

	}

}
