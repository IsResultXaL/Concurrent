package chapter2.child3.study1;

public class Run {
	
	public static void main(String[] args) {
		PrintString pringStringService = new PrintString();
		pringStringService.printStringMethod();
		System.out.println("我要停止它！stopThread = " + Thread.currentThread().getName());
		pringStringService.setContinuePrint(false);
	}

}
