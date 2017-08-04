package chapter3.child1.study4;

public class ThreadB extends Thread {
	
	private Object lock;
	
	public ThreadB(Object lock) {
		this.lock = lock;
	}
	
	@Override
	public void run() {
		super.run();
		Service.testMethod(lock);
	}

}
