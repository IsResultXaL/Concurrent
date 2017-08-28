package chapter4.child2.study1;

public class ThreadA extends Thread {

	private Service service;
	
	public ThreadA(Service service) {
		this.service = service;
	}
	
	@Override
	public void run() {
		service.read();
	}
}
