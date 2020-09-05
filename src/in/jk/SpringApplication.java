package in.jk;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApplication {
	
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		Employee employee =(Employee) applicationContext.getBean("emp");
		System.out.println(employee);
		
		EmployeeDao employeeDao =(EmployeeDao) applicationContext.getBean("empDao");
		System.out.println(employeeDao);
		
		employeeDao.loadAllEmployee();
		employeeDao.loadAllEmployeeFromOtherDB();
		
		
		
	}

}
