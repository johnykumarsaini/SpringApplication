package in.jk;

import java.util.HashSet;
import java.util.Set;

public class Test {
	
	Set<String> list = new HashSet<String>();
	public void setValue() {
		
		list.add("jk");list.add("sha");list.add("harsh");
		list.add("jk1");list.add("jk11");list.add("jk111");
	}
	
	public static void main(String[] args) {
		
		String name="jk";
	    Test test = new Test();
		test.setValue();
		String userName=test.findUserName(name);
		System.out.println("Recommended  Name :: "+userName);
	}
	
	private String findUserName(String userName) {
		int index =1;
		if(list.contains(userName)) {
		    userName =userName+index;
			System.out.println(userName);
			return findUserName( userName);
			
		}
		else {
			return userName;
			
		}
		
		
		
		
	
		
	}

}
