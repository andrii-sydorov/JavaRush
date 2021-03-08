package lecture_16.easy;

/**
 * 1. ������� public static ����� TestThread, �������������� �� ������ Thread.
 * 2. ������� ������ ���� ������ TestThread, ������� ������� � ������� "it's a static block inside TestThread". 
 * 3. ����� run ������ �������� � ������� "it's a run method".
 * 
 * @author SMD_ASY
 *
 */

public class TestThreadExtendsThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestThread testThread = new TestThread();
		testThread.start();

	}

	public static class TestThread extends Thread {
		static {
			System.out.println("it's a static block inside TestThread");
		}

		@Override
		public void run() {
			System.out.println("it's a run method");
		}
	}

}
