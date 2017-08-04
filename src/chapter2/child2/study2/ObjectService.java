package chapter2.child2.study2;

public class ObjectService {
	
	public void serviceMethod() {
		try {
			synchronized (this) {
				System.out.println("begin time = " + System.currentTimeMillis());
				Thread.sleep(2000);
				System.out.println("end time = " + System.currentTimeMillis());
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
