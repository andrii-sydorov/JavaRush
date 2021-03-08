package lecture_16.easy;

/**
 * ������� public static class TestThread - ���� � ����������� Runnable.
 * TestThread ������ �������� � ������� "My first thread".
 * 
 * @author SMD_ASY
 *
 */

public class FirstThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadTask threadTask = new ThreadTask();
		new Thread(threadTask).run();
		new Thread(new FirstThread().new ThreadTaskNoStatic()).start();

	}

	public static class ThreadTask implements Runnable {
		@Override
		public void run() {
			System.out.println("My thread from static class");
		}
	}

	public class ThreadTaskNoStatic implements Runnable {
		@Override
		public void run() {
			System.out.println("My thread from no-static class");
		}
	}

}
