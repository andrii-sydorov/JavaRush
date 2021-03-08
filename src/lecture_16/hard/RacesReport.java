package lecture_16.hard;

/**
 * 1. ���������, ��� ������ ���������. 
 * 2. �������� ������ ������ run ���, ����� ������ ������� ����� ������ ��������� ������ ������� � numSeconds �� 1, �
 * ����� ����� [����!] (�� �������). 
 * 3. ���� ���� �������� 3.5 ������� ��� �����, ������ �� ������� interrupt � ������ ���� ������ � ������� �����
 * [��������!].
 * 
 * ������ ��� numSeconds=4 : 
 * "4 3 2 1 ��������!"
 * 
 * 4. ���� ���� �������� ����� 3.5 ������, ��� ������ ����������� ����. ������
 * ��� numSeconds=3 : 
 * "3 2 1 ����!"
 * 
 * PS: ����� sleep ����������� InterruptedException.
 * 
 * @author SMD_ASY
 *
 */

public class RacesReport {

	public static volatile int numberSeconds = 4;
	
	public static volatile boolean isFinished = false;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		RacingClock clock = new RacingClock();
		Thread.sleep(3500);
		clock.interrupt();
		if (!clock.isInterrupted()) {
			System.out.print("����!");
		} else {
			System.out.print("��������!");
		}
	}

	public static class RacingClock extends Thread {

		public RacingClock() {
			start();
		}

		@Override
		public void run() {
//			long start = System.currentTimeMillis();

			try {
				while (!Thread.currentThread().isInterrupted() && numberSeconds > 0) {
					System.out.print(numberSeconds + " ");
					Thread.sleep(1000);
					numberSeconds--;
				}
			} catch (InterruptedException ie) {
			}
		}
//			long stop = System.currentTimeMillis();
//			if (stop - start >= 3500) {
//				Thread.currentThread().interrupt();
//			}
//			if (!Thread.currentThread().isInterrupted()) {
//				System.out.println("����!");
//			} else {
//				System.out.print("��������!");
//			}
	}
}
