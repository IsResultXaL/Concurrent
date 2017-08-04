package chapter1.child7.study2;

public class Run3 {
	
	public static void main(String[] args) {
		Thread.currentThread().interrupt();
		System.out.println("是否停止1 = " + Thread.currentThread().isInterrupted());
		System.out.println("是否停止2 = " + Thread.currentThread().isInterrupted());
		System.out.println("end");
	}

}
