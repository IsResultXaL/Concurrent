package chapter4.child1.study11.test2;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Service {

	private ReentrantLock lock = new ReentrantLock();
	private Condition condition = lock.newCondition();
	
	public void waitMethod() {
		try {
			lock.lock();
			condition.await();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			lock.unlock();
		}
	}
	
	public void notityMethod() {
		try {
			lock.lock();
			System.out.println("有没有线程正在等待condition?"
					+ lock.hasWaiters(condition) + "线程数是多少?"
					+ lock.getWaitQueueLength(condition));
			condition.signal();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			lock.unlock();
		}
	}
	
}
