package chapter1.child2.study3;

public class Run2 {
	
	public static void main(String[] args) {
		MyThread2 thread = new MyThread2();
		Thread a = new Thread(thread, "A");
		Thread b = new Thread(thread, "B");
		Thread c = new Thread(thread, "C");
		Thread d = new Thread(thread, "D");
		Thread e = new Thread(thread, "E");
		
		a.start();
		b.start();
		c.start();
		d.start();
		e.start();
		
	}

}
