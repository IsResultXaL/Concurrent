package chapter3.child1.study11.s2;

public class P {
	
	private String lock;
	
	public P(String lock) {
		this.lock = lock;
	}
	
	public void setValue() {
		try {
			synchronized (lock) {
				while(!ValueObject.value.equals("")) {
					System.out.println("生产者" + Thread.currentThread().getName()
							+ " WAITING了★");
					lock.wait();
				}
				
				System.out.println("生产者" + Thread.currentThread().getName() + "RUNNABLE了");
				String value = System.currentTimeMillis() + "_" + System.nanoTime();
				ValueObject.value = value;
				lock.notifyAll();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
