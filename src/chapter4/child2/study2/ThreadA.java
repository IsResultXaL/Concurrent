package chapter4.child2.study2;

public class ThreadA extends Thread {

	private Service service;
	
	public ThreadA(Service service) {
		this.service = service;
	}
	
	@Override
	public void run() {
		service.write();
	}
}
