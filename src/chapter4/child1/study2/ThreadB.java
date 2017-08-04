package chapter4.child1.study2;

public class ThreadB extends Thread {
	
	private MyService service;
	
	public ThreadB(MyService service) {
		this.service = service;
	}

	@Override
	public void run() {
		service.methodB();
	}
	
}
