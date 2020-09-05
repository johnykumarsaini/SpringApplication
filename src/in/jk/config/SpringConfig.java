package in.jk.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.jk.javaconfig.User;
import in.jk.spring.beanlifecycle.Employee;

@Configuration
public class SpringConfig {

	@Bean(name = "user")
	public User getUser() {
		return new User();

	}

	@Bean(name = "emp",initMethod = "init" ,destroyMethod = "destroy")
	public Employee getEmployee() {
		return new Employee();

	}

}
