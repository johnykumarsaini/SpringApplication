package in.jk.spring.autowired.test;

import org.springframework.beans.factory.annotation.Autowired;

public class TestBean {

	@Autowired
	@DeveloperQualifier()
	Employee developer;

	@Autowired
	@ManagerQualifier
	Employee manager;

	public void printEmpoyee() {

		System.out.println(developer);
		System.out.println(manager);

	}

}
