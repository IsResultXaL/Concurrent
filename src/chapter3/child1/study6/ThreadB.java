package chapter3.child1.study6;

public class ThreadB extends Thread {
	
	private Object lock;
	
	public ThreadB(Object lock) {
		this.lock = lock;
	}

	@Override
	public void run() {
		Service service = new Service();
		service.testMethod(lock);
	}
}