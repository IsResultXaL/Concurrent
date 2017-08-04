package chapter2.child3.study3;

public class RunThread extends Thread {
	
	volatile private boolean isRunning = true;
	
	public boolean isRunning() {
		return isRunning;
	}

	public void setRunning(boolean isRunning) {
		this.isRunning = isRunning;
	}
	
	@Override
	public void run() {
		super.run();
		System.out.println("进入run了");
		while(isRunning == true){}
		System.out.println("线程被停止了！");
	}
}
