package chapter2.child1.study7;

public class Run {

	public static void main(String[] args) {
		try {
			Service service = new Service();
			ThreadA a = new ThreadA(service);
			a.setName("a");
			a.start();
			Thread.sleep(500);
			ThreadB b = new ThreadB(service);
			b.setName("b");
			b.start();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
