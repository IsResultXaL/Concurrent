package chapter3.child1.study3;

public class Test1 {
	
	public static void main(String[] args) {
		try {
			String newString = new String("");
			newString.wait();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
