package chapter2.child1.study8;

public class MyThreadA extends Thread {
	
	private Sub sub;
	
	public MyThreadA(Sub sub) {
		super();
		this.sub = sub;
	}
	
	@Override
	public void run() {
		sub.serviceMethod();
	}

}
