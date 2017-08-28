package chapter4.child1.study12.test3;

public class Run {

	public static void main(String[] args) {
		final Service service = new Service();
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				service.serviceMethod();
			}
		};
		Thread thread = new Thread(runnable);
		thread.start();
	}
	
}
