package chapter2.child2.study8;

public class Service {
	
	public void testMethod1(MyObject object) {
		synchronized (object) {
			try {
				System.out.println("testMethod1 ______getLock time = " + 
						System.currentTimeMillis() + " run ThreadName = "
						+ Thread.currentThread().getName());
				Thread.sleep(2000);
				System.out.println("testMethod1 releaseLock time = " +
						System.currentTimeMillis() + " run ThreadName = "
						+ Thread.currentThread().getName());
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

}
