package chapter2.child2.study13;

import chapter2.child2.study13.PublicClass.PrivateClass;

public class Run {
	
	public static void main(String[] args) {
		PublicClass publicClass = new PublicClass();
		publicClass.setUsername("usernameValue");
		publicClass.setPassword("passwordValue");
		System.out.println(publicClass.getUsername() + " " + publicClass.getPassword());
		
		PrivateClass privateClass = publicClass.new PrivateClass();
		privateClass.setAge("ageValue");
		privateClass.setAddress("addressValue");
		System.out.println(privateClass.getAge() + " " + privateClass.getAddress());
		
	}

}
