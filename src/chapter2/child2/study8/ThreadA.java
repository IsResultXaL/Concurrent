package chapter2.child2.study8;

public class ThreadA extends Thread {
	
	private Service service;
	private MyObject object;
	
	public ThreadA(Service service, MyObject object) {
		this.service = service;
		this.object = object;
	}

	@Override
	public void run() {
		super.run();
		service.testMethod1(object);
	}
	
}
