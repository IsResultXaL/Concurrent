package chapter3.child2.study4;

public class MyThread extends Thread {
	
	@Override
	public void run() {
		try {
			System.out.println("begin Timer = " + System.currentTimeMillis());
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
