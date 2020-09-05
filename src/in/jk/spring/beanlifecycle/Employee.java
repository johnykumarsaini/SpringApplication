package in.jk.spring.beanlifecycle;

import org.springframework.beans.factory.InitializingBean;

public class Employee implements InitializingBean {
	
	private int empId;
	private String name;
	
	public void init() {
		
		System.out.println("Spring Bean initialization ....");
		System.out.println();
		
    }
	
	@Override
	public void afterPropertiesSet() throws Exception {
		
		System.out.println("Value is Set :: ");
		
	}
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
    public void destroy() {
		
    	System.out.println();
		System.out.println("Spring Bean clean up ....");
		
    }

	

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + "]";
	}
	

}
