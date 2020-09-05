package in.jk.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class BeanConfig {

	@Bean(name="employee")
	public Employee getBean() {
		return new Employee();
		
	}
	
	
	@Bean(name="reguemployee")
	@Primary
	public RegularEmployee getEmp() {
		return new RegularEmployee();
		
	}
	
}
