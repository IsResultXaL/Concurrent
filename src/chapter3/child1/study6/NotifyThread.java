package chapter3.child1.study6;

public class NotifyThread extends Thread {
	
	private Object lock;
	
	public NotifyThread(Object lock) {
		this.lock = lock;
	}
	
	@Override
	public void run() {
		synchronized (lock) {
			lock.notifyAll();
		}
	}

}
