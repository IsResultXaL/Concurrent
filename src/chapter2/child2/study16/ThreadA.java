package chapter2.child2.study16;

public class ThreadA extends Thread {

	private MyService service;
	
	public ThreadA(MyService service) {
		this.service = service;
	}
	
	@Override
	public void run() {
		super.run();
		service.testMethod();
	}
	
}
