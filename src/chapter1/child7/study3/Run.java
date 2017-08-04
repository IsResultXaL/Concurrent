package chapter1.child7.study3;

public class Run {
	
	public static void main(String[] args) {
		MyThread thread = new MyThread();
		thread.start();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		thread.interrupt();
		System.out.println("end!");
	}

}
