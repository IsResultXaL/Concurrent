package chapter3.child1.study14;

public class BackupB extends Thread {
	
	private DBTools dbtools;
	
	public BackupB(DBTools dbtools) {
		this.dbtools = dbtools;
	}
	
	@Override
	public void run() {
		dbtools.backupB();
	}

}
