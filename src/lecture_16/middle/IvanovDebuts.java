package lecture_16.middle;

/**
 * 1. ���������, ��� ������ ���������. 
 * 2. ����� ������� ���, ����� ������ ������ ������ ����� ����� �� ������������ �������. 
 * 3. �������, ����� ����� ����� ������� � ������� ivanov, ����� ������ ������������, ���� �� ���������� �� ��������� �����.
 * 
 * @author SMD_ASY
 *
 */

public class IvanovDebuts {

	public static int totalSpeechCount = 200;
	public static int utterancesPerSpeech = 1000000;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Politician ivanov = new Politician("������");
		ivanov.join();
		Politician petrov = new Politician("������");
		Politician sidorov = new Politician("�������");

		while (ivanov.getSpeechCount() + petrov.getSpeechCount() + sidorov.getSpeechCount() < totalSpeechCount) {
		}

		System.out.println(ivanov);
		System.out.println(petrov);
		System.out.println(sidorov);
	}

	public static class Politician extends Thread {
		private volatile int utteranceCount;

		public Politician(String name) {
			super(name);
			start();
		}

		public void run() {
			while (utteranceCount < totalSpeechCount * utterancesPerSpeech) {
				utteranceCount++;
			}
		}

		public int getSpeechCount() {
			return utteranceCount / utterancesPerSpeech;
		}

		@Override
		public String toString() {
			return String.format("%s ������ ���� %d ���", getName(), getSpeechCount());
		}
	}

}
