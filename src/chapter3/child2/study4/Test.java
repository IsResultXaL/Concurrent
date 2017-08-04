package chapter3.child2.study4;

public class Test {
	
	public static void main(String[] args) throws InterruptedException {
		MyThread thread = new MyThread();
		thread.start();
		thread.join(2000);
		System.out.println("end Timer = " + System.currentTimeMillis());
	}

}
