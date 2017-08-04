package chapter1.child2.study3;

public class BLogin extends Thread {

	@Override
	public void run() {
		LoginServlet.doPost("b", "bb");
	}
}
