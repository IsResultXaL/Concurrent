package chapter4.child1.study2;

public class ThreadAA extends Thread {
	
	private MyService service;
	
	public ThreadAA(MyService service) {
		this.service = service;
	}

	@Override
	public void run() {
		service.methodA();
	}
	
}
