package chapter2.child2.study10;

public class ThreadA extends Thread {
	
	private Service service;
	
	public ThreadA(Service service) {
		this.service = service;
	}
	
	@Override
	public void run() {
		service.print("AA");
	}

}
