package chapter1.child11;

public class MyThread extends Thread {
	
	private int i = 0;
	
	@Override
	public void run() {
		try {
			while(true){
				i++;
				System.out.println("i=" + i);
				Thread.sleep(1000);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
