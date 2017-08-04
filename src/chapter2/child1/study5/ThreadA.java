package chapter2.child1.study5;

public class ThreadA extends Thread {
	
	private PublicVar publicVar;
	public ThreadA(PublicVar publicVar) {
		super();
		this.publicVar = publicVar;
	}
	
	@Override
	public void run() {
		super.run();
		publicVar.setValue("B", "BB");
	}

}
