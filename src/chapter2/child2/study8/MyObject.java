package chapter2.child2.study8;

public class MyObject {
	
	synchronized public void speedPrintString() {
		System.out.println("speedPrintString _____getLock time = "
				+ System.currentTimeMillis() + " run ThreadName = "
				+ Thread.currentThread().getName());
		System.out.println("--------------");
		System.out.println("speedPrintString releaseLock time = "
				+ System.currentTimeMillis() + " run ThreadName = "
				+ Thread.currentThread().getName());
	}

}
