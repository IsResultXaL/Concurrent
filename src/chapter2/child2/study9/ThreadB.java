package chapter2.child2.study9;

public class ThreadB extends Thread {
	
	private Service service;
	
	public ThreadB(Service service) {
		this.service = service;
	}
	
	@Override
	public void run() {
		service.printB();
	}

}
