package in.jk.spring.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApplication {
	
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Employee employee = (Employee) applicationContext.getBean("emp");
		System.out.println(employee);
		
		Employee employee1 = (Employee) applicationContext.getBean("emp1");
		System.out.println(employee1);
		
		
		
		RegularEmployee regularEmployee =  (RegularEmployee) applicationContext.getBean("reguemployee");
		System.out.println(regularEmployee);
	
	
		
		
	
		
	}
	
	

}
