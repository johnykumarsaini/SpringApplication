package in.jk.spring.autowired;

import org.springframework.beans.factory.annotation.Qualifier;


public class Address{
	
	public int addressId;
	public String address;
	
	
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", address=" + address + "]";
	}
	
	
	
	
	
}