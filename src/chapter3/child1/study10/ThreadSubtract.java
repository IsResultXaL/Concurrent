package chapter3.child1.study10;

public class ThreadSubtract extends Thread {
	
	private Subtract r;
	
	public ThreadSubtract(Subtract r) {
		this.r = r;
	}
	
	@Override
	public void run() {
		r.subtract();
	}

}
