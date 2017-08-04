package chapter3.child1.study10;

public class Subtract {
	
	private String lock;
	public Subtract(String lock) {
		this.lock = lock;
	}

	public void subtract() {
		try {
			synchronized (lock) {
				while(ValueObject.list.size() == 0) {
					System.out.println("wait begin ThreadName = " + Thread.currentThread().getName());
					lock.wait();
					System.out.println("wait end ThreadName = " + Thread.currentThread().getName());
				}
				ValueObject.list.remove(0);
				System.out.println("list size = " + ValueObject.list.size());
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
