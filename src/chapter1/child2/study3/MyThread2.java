package chapter1.child2.study3;

public class MyThread2 extends Thread {
	
	private int count = 5;
	@SuppressWarnings("static-access")
	@Override
	synchronized public void run() {
		super.run();
		count--;
		System.out.println("由" + this.currentThread().getName() + " 计算,count=" + count);
	}

}
