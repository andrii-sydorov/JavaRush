package lecture_16.easy;

/**
 * 1. Разберись, что делает программа. 
 * 2. Реализуй логику метода printTikTak:
 * 	2.1. Через первые полсекунды должна выводиться в консоль фраза: Tik 
 * 	2.2. Через вторые полсекунды должна выводиться в консоль фраза: Tak
 * 
 * @author SMD_ASY
 *
 */

public class TikTak {

	public static volatile boolean isStopped = false;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Clock clock = new Clock();
		Thread.sleep(2000);
		isStopped = true;
		System.out.println("The clock has to be stopped");
		Thread.sleep(2000);
		System.out.println("Double-check");
	}

	public static class Clock extends Thread {

		public Clock() {
			setPriority(MAX_PRIORITY);
			start();
		}

		@Override
		public void run() {
			while (!isStopped) {
				try {
					printTikTak();
				} catch (InterruptedException ie) {
					ie.printStackTrace();
				}
			}
		}

		private void printTikTak() throws InterruptedException {
			Thread.sleep(500);
			System.out.println("Tik");
			Thread.sleep(500);
			System.out.println("Tak");
		}
	}

}
