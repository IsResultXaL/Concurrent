package chapter4.child1.study10.test1;

import java.util.concurrent.locks.ReentrantLock;

public class Service {
	
	private ReentrantLock lock = new ReentrantLock();
	
	public void serviceMethod1() {
		try {
			lock.lock();
			System.out.println("ServiceMethod1 getHoldCount=" + lock.getHoldCount());
			serviceMethod2();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			lock.unlock();
		}
	}
	
	public void serviceMethod2() {
		try {
			lock.lock();
			System.out.println("ServiceMethod2 getHoldCount=" + lock.getHoldCount());
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			lock.unlock();
		}
	}

}
