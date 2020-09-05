package in.jk.spring.autowired;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {
	
	
	@Bean(name="employee")
	public Employee getEmployee() {
		
		return new Employee();
		
	}
	
	
	@Bean(name="address1")
	@Qualifier("address1")
    public Address getaddres() {
		
		return new Address();
		
	}
	
	
	@Bean(name="address2")
	@Qualifier("address2")
	public Address getaddresInfo() {
		
		Address address =  new Address();
		address.setAddressId(1);
		address.setAddress("1205/GZB");
		
		return  address;
		
	}
	
	@Bean(name="address3")
	@AddressQualifier("mainAddress")
	public Address getaddresInfo1() {
		
		Address address =  new Address();
		address.setAddressId(1);
		address.setAddress("1205/Ghaziabad");
		
		return  address;
		
	}

}
