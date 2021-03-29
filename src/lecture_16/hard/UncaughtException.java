package lecture_16.hard;

/**
 * �����������, ��� ������ ���������.
 * 
 * �������� ��� UncaughtExceptionHandler - ��� �����.
 * 
 * ��� ��� ����������� ���������� ���������.
 * 
 * ����������� - ����������� - ������ ��� OurUncaughtExceptionHandler ��
 * �����������.
 * 
 * ��������� ������, �.�. ��� ������ ��������. :)
 * 
 * ��������� ��������� � ������������ �������:
 * 
 * ���� 1: My exception message
 * 
 * ���� 2: My exception message
 * 
 * @author SMD_ASY
 *
 */

public class UncaughtException {

	public static Thread.UncaughtExceptionHandler handler = new OurUncaughtExceptionHandler();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestedThread commonThread = new TestedThread(handler);

		Thread threadA = new Thread(commonThread, "���� 1");
		Thread threadB = new Thread(commonThread, "���� 2");

//		Thread test = new Thread(new Thread());

		// Thread.setDefaultUncaughtExceptionHandler(handler);
		threadA.setUncaughtExceptionHandler(handler);
		threadB.setUncaughtExceptionHandler(handler);

		threadA.start();
		threadB.start();

//		Thread.setDefaultUncaughtExceptionHandler(handler);

		threadA.interrupt();
		threadB.interrupt();
	}

	public static class TestedThread extends Thread {
		public TestedThread(Thread.UncaughtExceptionHandler handler) {
			setUncaughtExceptionHandler(handler);
			start();
		}

		public void run() {
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				throw new RuntimeException("My exception message");
			}
		}
	}

	public static class OurUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler {
		@Override
		public void uncaughtException(Thread t, Throwable e) {
			System.out.println(t.getName() + ": " + e.getMessage());
		}
	}

}
