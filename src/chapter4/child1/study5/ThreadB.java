package chapter4.child1.study5;

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
