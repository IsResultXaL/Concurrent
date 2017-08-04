package chapter3.child1.study14;

public class Run {
	
	public static void main(String[] args) {
		DBTools dbtools = new DBTools();
		for(int i = 0; i < 20; i++) {
			BackupA a = new BackupA(dbtools);
			a.start();
			BackupB b = new BackupB(dbtools);
			b.start();
		}
	}

}
