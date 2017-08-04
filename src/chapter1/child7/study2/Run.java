package chapter1.child7.study2;

public class Run {
	
	public static void main(String[] args) {
		MyThread thread = new MyThread();
		thread.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		thread.interrupt();
		System.out.println("是否停止1 = " + Thread.interrupted());
		System.out.println("是否停止2 = " + Thread.interrupted());
	}

}
