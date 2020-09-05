package in.jk.spring.autowired.test;

import org.springframework.context.annotation.Primary;


public class Manager implements Employee 

{

	@Override
	public String toString() {
		return "Maneger Bean";
	}
	
	
}
