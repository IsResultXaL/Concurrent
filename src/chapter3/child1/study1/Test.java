package chapter3.child1.study1;

public class Test {
	
	public static void main(String[] args) throws InterruptedException {
		MyList service = new MyList();
		
		ThreadB b = new ThreadB(service);
		b.setName("B");
		b.start();
		Thread.sleep(50);
		ThreadA a = new ThreadA(service);
		a.setName("A");
		a.start();
	}

}
