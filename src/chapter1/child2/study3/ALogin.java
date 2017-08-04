package chapter1.child2.study3;

public class ALogin extends Thread {

	@Override
	public void run() {
		LoginServlet.doPost("a", "aa");
	}
}
