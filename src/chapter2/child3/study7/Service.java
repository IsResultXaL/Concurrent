package chapter2.child3.study7;

public class Service {
	
	private boolean isContinueRun = true;
	
	public void runMethod() {
		String anyString = new String();
		while(isContinueRun == true) {
			synchronized (anyString) {
				
			}
		}
		
		System.out.println("停下来了！");
	}

	public void stopMethod() {
		isContinueRun = false;
	}
	
}
