package in.jk.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

	@Bean(name = "user")
	public User getUser() {
		return new User();

	}

	

}
