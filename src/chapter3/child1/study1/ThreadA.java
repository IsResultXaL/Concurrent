package chapter3.child1.study1;

public class ThreadA extends Thread {
	
	private MyList list;
	
	public ThreadA(MyList list) {
		this.list = list;
	}

	@Override
	public void run() {
		try {
			synchronized (list) {
				for(int i = 0; i < 10; i++){
					list.add();
					if(list.size() == 5) {
						list.notify();
						System.out.println("已发出通知");
					}
					System.out.println("添加了" + (i+1) + "个元素");
					Thread.sleep(1000);
				}
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
}
