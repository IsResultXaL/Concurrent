package chapter4.child1.study16;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Run {

	volatile private static int newxtPrintWho = 1;
	private static ReentrantLock lock = new ReentrantLock();
	final private static Condition conditionA = lock.newCondition();
	final private static Condition conditionB = lock.newCondition();
	final private static Condition conditionC = lock.newCondition();
	
	public static void main(String[] args) {
		
		Thread threadA = new Thread() {
			@Override
			public void run() {
				try {
					lock.lock();
					while(newxtPrintWho != 1) {
						conditionA.await();
					}
					for(int i = 0; i < 3; i++) {
						System.out.println("ThreadA " + (i+1));
					}
					newxtPrintWho = 2;
					conditionB.signalAll();
				} catch (Exception e) {
					e.printStackTrace();
				}finally {
					lock.unlock();
				}
			}
		};
		
		Thread threadB = new Thread() {
			@Override
			public void run() {
				try {
					lock.lock();
					while(newxtPrintWho != 2) {
						conditionB.await();
					}
					for(int i = 0; i < 3; i++) {
						System.out.println("ThreadB " + (i+1));
					}
					newxtPrintWho = 3;
					conditionC.signalAll();
				} catch (Exception e) {
					e.printStackTrace();
				}finally {
					lock.unlock();
				}
			}
		};
		
		Thread threadC = new Thread() {
			@Override
			public void run() {
				try {
					lock.lock();
					while(newxtPrintWho != 3) {
						conditionC.await();
					}
					for(int i = 0; i < 3; i++) {
						System.out.println("ThreadC " + (i+1));
					}
					newxtPrintWho = 1;
					conditionA.signalAll();
				} catch (Exception e) {
					e.printStackTrace();
				}finally {
					lock.unlock();
				}
			}
		};
		
		Thread[] aArray = new Thread[5];
		Thread[] bArray = new Thread[5];
		Thread[] cArray = new Thread[5];
		
		for(int i = 0; i < 5; i++) {
			aArray[i] = new Thread(threadA);
			bArray[i] = new Thread(threadB);
			cArray[i] = new Thread(threadC);
			aArray[i].start();
			bArray[i].start();
			cArray[i].start();
		}
	}
	
}
