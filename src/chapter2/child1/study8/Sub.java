package chapter2.child1.study8;

public class Sub extends Main {
	
	@Override
	synchronized public void serviceMethod() {
		try {
			System.out.println("int sub 下一步 sleep begin threadName = "
					+ Thread.currentThread().getName() + " time = "
					+ System.currentTimeMillis());
			Thread.sleep(5000);
			System.out.println("int sub 下一步 sleep end threadName = "
					+ Thread.currentThread().getName() + " time = "
					+ System.currentTimeMillis());
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
