package lecture_16.middle;

/**
 * 1. ���������, ��� ������ ���������. 
 * 2. �������� ������ ������ doStep ���, ����� ����������� �������� ������. 
 *  2.1. ����� getSpeed() � ������ Runner ����������, ������� ����� � ������� ������ �����. �����, ����� ����� �������������
 *   ����� �������� ���������� ����� � �������. ���� ������ ������ 4 ���� � �������, �� �� 2 ������� �� ������� 8 �����. 
 *   ���� ������ ������ 2 ���� � �������, �� �� 2 ������� �� ������� 4 ����. 
 * 	2.2. ����� sleep � ������ Thread ��������� �������� ���� long.
 * 
 * �����! ��������� ����� Thread.sleep(), � �� Stopwatch.sleep().
 * 
 * @author SMD_ASY
 *
 */

public class StopwatchRunner {

	public static volatile boolean isStopped = false;

	public static void main(String[] args) throws InterruptedException {
		Runner ivanov = new Runner("Ivanov", 4);
		Runner petrov = new Runner("Petrov", 2);

		ivanov.start();
		petrov.start();
		Thread.sleep(2000);
		isStopped = true;
		Thread.sleep(1000);

	}

	public static class Stopwatch extends Thread {

		private int stepNumber;
		private Runner owner;

		public Stopwatch(Runner runner) {
			owner = runner;
		}

		public void run() {
			try {
				while (!isStopped) {
					doStep();
				}
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
		}

		public void doStep() throws InterruptedException {
			stepNumber++;
			// long sleepTime = owner.getSpeed() == 4 ? 250 : 500;
			Thread.sleep(1000 / owner.getSpeed());
			System.out.println(owner.getName() + " ������ ��� �" + stepNumber + "!");
		}
	}

	public static class Runner {
		private Stopwatch stopwatch;
		private String name;
		private int speed;

		public Runner(String name, int speed) {
			this.name = name;
			this.speed = speed;
			this.stopwatch = new Stopwatch(this);
		}

		public String getName() {
			return this.name;
		}

		public int getSpeed() {
			return this.speed;
		}

		public void start() {
			stopwatch.start();
		}

	}

}
