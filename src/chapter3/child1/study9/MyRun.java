package chapter3.child1.study9;

public class MyRun {
	
	private Object lock = new Object();
	
	private Runnable runnableA = new Runnable() {
		@Override
		public void run() {
			try {
				synchronized (lock) {
					System.out.println("begin wait");
					lock.wait();
					System.out.println("end wait");
				}
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	};
	
	private Runnable runnableB = new Runnable() {
		@Override
		public void run() {
			try {
				synchronized (lock) {
					System.out.println("begin notify");
					lock.notify();
					System.out.println("end notify");
				}
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	};
	
	public static void main(String[] args) {
		MyRun run = new MyRun();
		Thread a = new Thread(run.runnableA);
		a.start();
		Thread b = new Thread(run.runnableB);
		b.start();
	}

}
