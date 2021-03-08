package lecture_16.easy;

/**
 * Создать public static class TestThread - нить с интерфейсом Runnable.
 * TestThread должен выводить в консоль "My first thread".
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
