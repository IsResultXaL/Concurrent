package chapter1.child4;

public class Run {
	
	public static void main(String[] args) {
		IsaliveOtherTest test = new IsaliveOtherTest();
		Thread t = new Thread(test);
		System.out.println("main begin test isAlive=" + t.isAlive());
		t.setName("A");
		t.start();
		System.out.println("main end test isAlive=" + t.isAlive());
	}

}
