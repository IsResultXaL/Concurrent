package chapter3.child1.study11.s2;

public class ThreadC extends Thread {
	
	private C c;
	
	public ThreadC(C c) {
		this.c = c;
	}

	@Override
	public void run() {
		while(true) {
			c.getValue();
		}
	}
}
