package chapter4.child1.study12.test2;

import java.util.concurrent.locks.ReentrantLock;

public class Service {

	private ReentrantLock lock = new ReentrantLock();
	
	public void serviceMethod() {
		try {
			System.out.println(lock.isHeldByCurrentThread());
			lock.lock();
			System.out.println(lock.isHeldByCurrentThread());
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			lock.unlock();
		}
	}
	
}
