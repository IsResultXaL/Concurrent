package chapter2.child1.study6;

public class MyThread extends Thread {
	
	@Override
	public void run() {
		Service service = new Service();
		service.service1();
	}

}
