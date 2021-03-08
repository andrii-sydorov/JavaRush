package lecture_16.easy;

/**
 * 1. ���������, ��� ������ ���������. 
 * 2. �������� ������ ������ printTikTak:
 * 	2.1. ����� ������ ���������� ������ ���������� � ������� �����: Tik 
 * 	2.2. ����� ������ ���������� ������ ���������� � ������� �����: Tak
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
