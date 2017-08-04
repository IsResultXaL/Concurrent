package chapter2.child2.study2;

public class Run {

	public static void main(String[] args) {
		ObjectService service = new ObjectService();
		ThreadA a = new ThreadA(service);
		a.setName("A");
		a.start();
		ThreadB b = new ThreadB(service);
		b.setName("B");
		b.start();
	}
}
