package lecture_16.easy;

/**
 * 1. Разберись, что делает программа. 
 * 2. Сделай так, чтоб программа сначала
 * выводила результат нити, а когда нить завершится - продолжила метод main.
 * 
 * 3. Пример выходных данных: inside MyThread 0 inside MyThread 1 ... inside
 * MyThread 9 inside main 0 inside main 1 ... inside main 9
 * 
 * @author SMD_ASY
 *
 */

public class TwoThreads {

	public static InnerThread t = new InnerThread();
	public static String mainThread = "in main Thread";

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		t.start();
		t.join();
		for (int i = 0; i < 10; i++) {
			System.out.println(mainThread + i);
			sleep();
		}

	}

	public static void sleep() {
		try {
			Thread.sleep(10);
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}
	}

	public static class InnerThread extends Thread {
		public String innerThread = "in auxillarry Thread";

		@Override
		public void run() {
			for (int i = 0; i < 10; i++) {
				TwoThreads.sleep();
				System.out.println(innerThread + i);
			}
		}
	}

}
