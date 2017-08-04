package chapter3.child2.study6;

public class Run1 {
	
	public static void main(String[] args) {
		try {
			ThreadB b = new ThreadB();
			ThreadA a = new ThreadA(b);
			
			a.start();
			b.start();
			
			b.join(2000);
			
			System.out.println("main end" + System.currentTimeMillis());
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
