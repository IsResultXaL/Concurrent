package chapter1.child2.study1;

public class Run2 {
	
	public static void main(String[] args) {
		MyThread2 myThread = new MyThread2();
		myThread.setName("myThread");
		myThread.start();
		
		for(int i = 0; i < 10; i++){
			int time = (int) (Math.random() * 1000);
			
			try {
				Thread.sleep(time);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("main=" + Thread.currentThread().getName());
		}
		
	}

}
