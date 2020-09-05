package in.jk.spring.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Primary;

@Configuration
@ImportResource("classpath:/ApplicationContext.xml")

@Primary
public class RegularEmployee {

	@Value("${application.regular.empId}")
	private int empId;
	@Value("${application.regular.name}")
	private String name;
	
	
	@Override
	public String toString() {
		return "RegularEmployee [empId=" + empId + ", name=" + name + "]";
	}
	


}
