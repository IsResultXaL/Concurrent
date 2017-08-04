package chapter2.child1.study8;

public class Test {
	
	public static void main(String[] args) {
		Sub subRef = new Sub();
		MyThreadA threadA = new MyThreadA(subRef);
		threadA.setName("A");
		threadA.start();
		MyThreadB threadB = new MyThreadB(subRef);
		threadB.setName("B");
		threadB.start();
	}

}
