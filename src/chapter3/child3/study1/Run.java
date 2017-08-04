package chapter3.child3.study1;

public class Run {
	
	public static ThreadLocal<Object> t1 = new ThreadLocal<Object>();
	
	public static void main(String[] args) {
		if(t1.get() == null) {
			System.out.println("从未放过值");
			t1.set("我的值");
		}
		System.out.println(t1.get());
		System.out.println(t1.get());
	}

}
