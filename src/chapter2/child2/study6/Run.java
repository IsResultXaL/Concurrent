package chapter2.child2.study6;

public class Run {
	
	public static void main(String[] args) {
		Task task = new Task();
		MyThread1 thread1 = new MyThread1(task);
		thread1.start();
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		MyThread2 thread2 = new MyThread2(task);
		thread2.start();
	}

}
