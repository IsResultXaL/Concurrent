package chapter3.child1.study1;

public class ThreadB extends Thread {
	
	private MyList list;
	
	public ThreadB(MyList list) {
		this.list = list;
	}
	
	@Override
	public void run() {
		try {
			synchronized (list) {
				if(list.size() != 5) {
					System.out.println("wait begin " + System.currentTimeMillis());
					list.wait();
					System.out.println("wait end " + System.currentTimeMillis());
				}
			}
			
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
