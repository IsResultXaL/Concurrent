package chapter3.child1.study3;

public class Test {
	
	public static void main(String[] args) {
		try {
			Object lock = new Object();
			MyThread1 t1 = new MyThread1(lock);
			t1.start();
			Thread.sleep(3000);
			MyThread2 t2 = new MyThread2(lock);
			t2.start();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
