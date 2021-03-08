package lecture_16.middle;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 * 1. ������ ���������� ������ run � ���� Stopwatch (����������). 
 * 2. Stopwatch ������ ��������� ���������� ������, ������� ������ �� �������� ���� �� �����
 * ������. 
 * 3. ������ ���������� ������ � �������.
 * 
 * @author SMD_ASY
 *
 */

public class CountSeconds {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		Stopwatch stopwatch = new Stopwatch();
		stopwatch.start();
		bf.readLine();
		stopwatch.interrupt();
		bf.close();

	}

	public static class Stopwatch extends Thread {
		private int seconds;

		public void run() {
			try {
				// add your code here - �������� ��� ���
				while (!Thread.currentThread().isInterrupted()) {
					Thread.sleep(1000);
					seconds++;
				}
			} catch (InterruptedException e) {
				System.out.println(seconds);
			}
		}
	}

}
