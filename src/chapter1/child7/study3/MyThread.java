package chapter1.child7.study3;

public class MyThread extends Thread {
	
	@Override
	public void run() {
		super.run();
		try {
			for(int i = 0; i < 500000; i++){
				if(Thread.interrupted()){
					System.out.println("已经是停止状态了，我要退出了！");
					throw new InterruptedException();
				}
				System.out.println("i=" + (i+1));
			}
		} catch (Exception e) {
			System.out.println("进MyThread.java类run方法中的catch了！");
			e.printStackTrace();
		}
		
	}

}
