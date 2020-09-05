package in.jk.spring.autowired.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class MyConfiguration {

	@Bean
	@Primary
	@DeveloperQualifier()
	public Employee getJavaEmp() {
		return new Developer();

	}

	@Bean
	@ManagerQualifier()
	public Employee getManeger() {
		return new Manager();

	}

}
