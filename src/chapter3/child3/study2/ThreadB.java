package chapter3.child3.study2;

public class ThreadB extends Thread {
	
	@Override
	public void run() {
		try {
			for(int i = 0; i < 100; i++) {
				Tools.t1.set("ThreadB" + (i + 1));
				System.out.println("ThreadB get Value = " + Tools.t1.get());
				Thread.sleep(200);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
