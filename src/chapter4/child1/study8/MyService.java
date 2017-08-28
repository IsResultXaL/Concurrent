package chapter4.child1.study8;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {
	
	private Lock lock = new ReentrantLock();
	private Condition condition1 = lock.newCondition();
	private Condition condition2 = lock.newCondition();
	private boolean hasValue = false;
	
	public void set() {
		try {
			lock.lock();
			while(hasValue == true) {
				System.out.println("有可能★★连续");
				condition1.await();
			}
			System.out.println("打印★");
			hasValue = true;
			condition2.signal();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			lock.unlock();
		}
	}
	
	public void get() {
		try {
			lock.lock();
			while(hasValue == false) {
				System.out.println("有可能☆☆连续");
				condition2.await();
			}
			System.out.println("打印☆");
			hasValue = false;
			condition1.signal();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			lock.unlock();
		}
	}

}
