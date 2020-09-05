package in.jk.spring.beanlifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.jk.config.SpringConfig;

public class SpringBeanLifeCycleApplication {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
		
		Employee employee =(Employee) applicationContext.getBean("emp");
		
		employee.setEmpId(1);
		employee.setName("JK");
		System.out.println(employee);
		
		applicationContext.close();
		
	
		
			
		
	}

}


	


