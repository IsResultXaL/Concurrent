package chapter4.child2.study1;

public class ThreadB extends Thread {

	private Service service;
	
	public ThreadB(Service service) {
		this.service = service;
	}
	
	@Override
	public void run() {
		service.read();
	}
}
