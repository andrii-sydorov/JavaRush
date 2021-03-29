package lecture_16.middle;

/**
 * –азберись, как работает программа. ѕо образу и подобию CountdownRunnable
 * создай нить CountUpRunnable, котора€ выводит значени€ в нормальном пор€дке -
 * от 1 до number.
 * 
 * @author SMD_ASY
 *
 */

public class CountUpCountDown {

	public static int number = 5;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Thread(new CountUpRunnable(), "по возрастанию").start();
		new Thread(new CountDownRunnable(), "по убыванию").start();
	}

	public static class CountUpRunnable implements Runnable {
		private int countIndexUp = 1;

		public void run() {
			try {
				while (true) {
					System.out.println(toString());
					Thread.sleep(500);
					if (countIndexUp == number) {
						return;
					}
					countIndexUp++;
				}
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
		}

		public String toString() {
			return Thread.currentThread().getName() + ": " + countIndexUp;
		}
	}

	public static class CountDownRunnable implements Runnable {
		private int countIndexDown = number;

		public void run() {
			try {
				while (true) {
					System.out.println(toString());
					countIndexDown--;
					if (countIndexDown == 0) {
						return;
					}
					Thread.sleep(500);
				}
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
		}

		public String toString() {
			return Thread.currentThread().getName() + ": " + countIndexDown;
		}
	}

}
