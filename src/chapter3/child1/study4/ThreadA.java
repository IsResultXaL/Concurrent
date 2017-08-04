package chapter3.child1.study4;

public class ThreadA extends Thread {
	
	private Object lock;
	
	public ThreadA(Object lock) {
		this.lock = lock;
	}
	
	@Override
	public void run() {
		super.run();
		Service.testMethod(lock);
	}

}
