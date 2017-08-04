package chapter2.child2.study2;

public class ThreadA extends Thread {
	
	private ObjectService service;
	
	public ThreadA(ObjectService service) {
		this.service = service;
	}
	
	@Override
	public void run() {
		super.run();
		service.serviceMethod();
	}

}
