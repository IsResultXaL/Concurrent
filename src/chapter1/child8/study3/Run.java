package chapter1.child8.study3;

public class Run {

	public static void main(String[] args) {
		final MyObject myobject = new MyObject();
		Thread thread1 = new Thread() {
			@Override
			public void run() {
				myobject.setValue("a", "aa");
			};
		};
		thread1.setName("a");
		thread1.start();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		Thread thread2 = new Thread() {
			@Override
			public void run() {
				myobject.printUsernamePassword();
			}
		};
		thread2.start();
	}
}
