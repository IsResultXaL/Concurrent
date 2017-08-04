package chapter2.child3.study2;

public class PrintString implements Runnable {
	
	private boolean isContinuePrint = true;
	
	public boolean isContinuePrintt() {
		return isContinuePrint;
	}
	
	public void setContinuePrint(boolean isContinuePrint) {
		this.isContinuePrint = isContinuePrint;
	}

	public void printStringMethod() {
		try {
			while(isContinuePrint == true) {
				System.out.println("run printStringMethod threadName = "
						+ Thread.currentThread().getName());
				Thread.sleep(1000);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	@Override
	public void run() {
		printStringMethod();
	}
	
	

}
