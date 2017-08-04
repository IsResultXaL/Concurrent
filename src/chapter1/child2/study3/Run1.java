package chapter1.child2.study3;

public class Run1 {
	
	public static void main(String[] args) {
		MyThread1 a = new MyThread1("A");
		MyThread1 b = new MyThread1("B");
		MyThread1 c = new MyThread1("C");
		
		a.start();
		b.start();
		c.start();
	}

}
