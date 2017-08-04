package chapter4.child1.study2;

public class ThreadBB extends Thread {
	
	private MyService service;
	
	public ThreadBB(MyService service) {
		this.service = service;
	}

	@Override
	public void run() {
		service.methodB();
	}
	
}
