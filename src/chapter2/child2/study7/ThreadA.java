package chapter2.child2.study7;

public class ThreadA extends Thread{

	private Service service;
	
	public ThreadA(Service service) {
		this.service = service;
	}
	
	@Override
	public void run() {
		super.run();
		service.setUsernamePassword("a", "aa");
	}
}
