package lecture_16.easy;

public class BlockedThread {

	static Thread t1 = new T1();
	static Thread t2 = new T2();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		t1.start();
		t1.interrupt();
		t2.start();
	}

	public static class T1 extends Thread {
		@Override
		public void run() {
			try {
				t2.join();
				System.out.println(getClass().getSimpleName() + " finished");
			} catch (InterruptedException ie) {
				System.out.println(getClass().getSimpleName() + " was interrupted");
			}
		}
	}

	public static class T2 extends Thread {
		@Override
		public void run() {
			try {
				t1.join();
				System.out.println(getClass().getSimpleName() + " finished");
			} catch (InterruptedException ie) {
				System.out.println(getClass().getSimpleName() + " was interrupted");
			}
		}
	}

}
