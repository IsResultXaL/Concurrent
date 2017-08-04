package chapter3.child1.study4;

public class Service {
	
	public static void testMethod(Object lock) {
		try {
			synchronized (lock) {
				System.out.println("wait begin");
				Thread.sleep(4000);
				System.out.println("wait end");
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
