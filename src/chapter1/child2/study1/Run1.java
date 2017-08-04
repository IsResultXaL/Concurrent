package chapter1.child2.study1;

public class Run1 {
	
	public static void main(String[] args) {
		MyThread1 myThread = new MyThread1();
		myThread.start();
		System.out.println("运行结束！");
	}

}
