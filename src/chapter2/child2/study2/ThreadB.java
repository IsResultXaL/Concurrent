package chapter2.child2.study2;

public class ThreadB extends Thread {
	
	private ObjectService service;
	
	public ThreadB(ObjectService service) {
		this.service = service;
	}
	
	@Override
	public void run() {
		super.run();
		service.serviceMethod();
	}

}
