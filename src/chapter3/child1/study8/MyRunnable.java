package chapter3.child1.study8;

public class MyRunnable {
	
	static private Object lock = new Object();
	static private Runnable runnable1 = new Runnable() {
		
		@Override
		public void run() {
			try {
				synchronized (lock) {
					System.out.println("wait begin time = " + System.currentTimeMillis());
					lock.wait(5000);
					System.out.println("wait end time = " + System.currentTimeMillis());
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		}
	};

	public static void main(String[] args) {
		Thread t = new Thread(runnable1);
		t.start();
	}
}
