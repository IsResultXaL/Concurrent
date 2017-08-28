package chapter4.child1.study8;

public class ThreadB extends Thread {

	private MyService service;
	
	public ThreadB(MyService service) {
		this.service = service;
	}
	
	@Override
	public void run() {
		for(int i = 0; i < Integer.MAX_VALUE; i++) {
			service.get();
		}
	}
	
}
