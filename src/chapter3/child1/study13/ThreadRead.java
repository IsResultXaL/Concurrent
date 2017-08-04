package chapter3.child1.study13;

import java.io.PipedReader;

public class ThreadRead extends Thread {
	
	private ReadData read;
	private PipedReader input;
	
	public ThreadRead(ReadData read, PipedReader input) {
		this.read = read;
		this.input = input;
	}
	
	@Override
	public void run() {
		read.readMethod(input);
	}

}
