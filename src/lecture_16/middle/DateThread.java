package lecture_16.middle;

import java.util.Date;

/**
 * 1. ������ ����� Violin ���, ���� �� ���� ������ ��� ����. ��������� ���������
 * MusicalInstrument 
 * 2. �������� ����������� ����� � ���� Violin. ���������� ������ ���� ���������:
 *  2.1. ������ ����� ������ ���� - ����� startPlaying().
 *  2.2. ������� 1 ������� - ����� sleepNSeconds(int n), ��� n - ���������� ������.
 *  2.3. ������ ����� ��������� ���� - ����� stopPlaying(). 
 *  2.4. ������ �� ������� ����������������� ���� � �������������. ��������� ������ ��
 * ������� 2.1 � 2.3.
 * 
 * ������ "Playing 1002 ms".
 * 
 * @author SMD_ASY
 *
 */

public class DateThread {

	public static int delay = 1000;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread violin = new Thread(new Violin("Player"));
		violin.start();
	}

	public static void sleepNSeconds(int n) {
		try {
			Thread.sleep(n * delay);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public interface MusicalInstrument extends Runnable {
		Date startPlaying();

		Date stopPlaying();
	}

	public static class Violin implements MusicalInstrument {
		private String owner;

		public Violin(String owner) {
			this.owner = owner;
		}

		public Date startPlaying() {
			System.out.println(this.owner + " is starting to play");
			return new Date();
		}

		public Date stopPlaying() {
			System.out.println(this.owner + " is stopping playing");
			return new Date();
		}

		@Override
		public void run() {
			Date start = startPlaying();
			sleepNSeconds(1);
			Date stop = stopPlaying();

			System.out.printf("Playing %d ms", stop.getTime() - start.getTime());
		}
	}

}
