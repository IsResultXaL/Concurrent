package chapter2.child3.study7;

public class ThreadA extends Thread {
	
	private Service service;
	public ThreadA(Service service) {
		this.service = service;
	}
	
	@Override
	public void run() {
		service.runMethod();
	}

}
