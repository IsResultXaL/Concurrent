package chapter4.child1.study2;

public class ThreadA extends Thread {
	
	private MyService service;
	
	public ThreadA(MyService service) {
		this.service = service;
	}

	@Override
	public void run() {
		service.methodA();
	}
	
}
