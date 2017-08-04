package chapter2.child3.study6;

public class Run {
	
	public static void main(String[] args) {
		try {
			MyService myService = new MyService();
			MyThread[] array = new MyThread[5];
			
			for(int i = 0; i < array.length; i++) {
				array[i] = new MyThread(myService);
			}
			
			for(int i = 0; i < array.length; i++) {
				array[i].start();
			}
			
			Thread.sleep(1000);
			System.out.println(MyService.aiRef.get());
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
