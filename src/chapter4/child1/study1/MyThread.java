package chapter4.child1.study1;

public class MyThread extends Thread {

	private MyService service;
	
	public MyThread(MyService service) {
		this.service = service;
	}
	
	@Override
	public void run() {
		service.testMethod();
	}
	
}
