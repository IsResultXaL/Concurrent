package chapter2.child1.study4;

public class MyObject {

	synchronized public void methodA(){
		try {
			System.out.println("begin methodA threadName = " + Thread.currentThread().getName());
			Thread.sleep(5000);
			System.out.println("end methodA="+System.currentTimeMillis());
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	synchronized public void methodB(){
		try {
			System.out.println("begin methodB  threadName = " + Thread.currentThread().getName());
			System.out.println("begin methodB  time = " + System.currentTimeMillis());
			Thread.sleep(5000);
			System.out.println("end");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
