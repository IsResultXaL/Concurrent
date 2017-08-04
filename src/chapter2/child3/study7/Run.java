package chapter2.child3.study7;

public class Run {

	public static void main(String[] args) {
		try {
			Service service = new Service();
			ThreadA a = new ThreadA(service);
			a.start();
			Thread.sleep(1000);
			ThreadB b = new ThreadB(service);
			b.start();
			System.out.println("已经发出停止的命令！");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
}
