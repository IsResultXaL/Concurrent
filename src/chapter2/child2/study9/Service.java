package chapter2.child2.study9;

public class Service {
	
	synchronized public static void printA() {
		try {
			System.out.println("线程名称为："  + Thread.currentThread().getName()
					+ "在" + System.currentTimeMillis() + "进入printA");
			Thread.sleep(3000);
			System.out.println("线程名称为："  + Thread.currentThread().getName()
					+ "在" + System.currentTimeMillis() + "离开printA");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	synchronized public static void printB() {
		System.out.println("线程名称为：" + Thread.currentThread().getName()
				+ "在" + System.currentTimeMillis() + "进入printB");
		System.out.println("线程名称为：" + Thread.currentThread().getName()
				+ "在" + System.currentTimeMillis() + "离开printB");
	}
	
}
