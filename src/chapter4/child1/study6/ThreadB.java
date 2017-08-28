package chapter4.child1.study6;

public class ThreadB extends Thread {
	
private MyService service;
	
	public ThreadB(MyService service) {
		this.service = service;
	}

	@Override
	public void run() {
		service.awaitB();
	}

}
