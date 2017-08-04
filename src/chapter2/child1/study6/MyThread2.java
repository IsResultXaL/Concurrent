package chapter2.child1.study6;

public class MyThread2 extends Thread {
	
	@Override
	public void run() {
		Sub sub = new Sub();
		sub.operateISubMethod();
	}

	public static void main(String[] args) {
		MyThread2 thread = new MyThread2();
		thread.start();
	}
}
