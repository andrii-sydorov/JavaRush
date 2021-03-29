package lecture_16.hard.FiveThreads;

import java.util.List;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 * 1. ������ 5 ��������� ����� ����� c �������� �� Thread �����:
 *  1.1. ���� 1 ������ ���������� �����������;
 *  1.2. ���� 2 ������ �������� "InterruptedException" ��� ������������� ���������� InterruptedException;
 *  1.3. ���� 3 ������ ������ ���������� �������� "���"; 
 *  1.4. ���� 4 ������ ����������� ��������� Message, ��� ������ ������ showWarning ���� ������ ���������������;
 *  1.5. ���� 5 ������ ������ � ������� ����� ���� �� ������� ����� "N", � ����� ������� � ������� ����� ��������� �����.
 * 2. � ����������� ����� ������ ���� ���� � List<Thread> threads � ������������� �������.
 * 3. ���� �� ������ ���������� �������������.
 * 
 * ���������: ���� 4 ����� ��������� ������� isAlive()
 * 
 * @author SMD_ASY
 *
 */

public class Main {

	public static List<Thread> list = new ArrayList<>(5);

	static {
		list.add(new Thread1());
		list.add(new Thread2());
		list.add(new Thread3());
		list.add(new Thread4());
		list.add(new Thread5());
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		for (int i = 0; i < list.size(); i++) {
			list.get(i).start();
			Thread.sleep(5000);
			if (i < 3) {
				list.get(i).interrupt();
			} else {
				list.get(i).join();
			}
			Thread.sleep(1000);
		}

	}

	public static class Thread1 extends Thread {
		@Override
		public void run() {
			System.out.println(String.format("The %s is started", getName()));
			while (!Thread.currentThread().isInterrupted()) {
			}
			return;
		}

	}

	public static class Thread2 extends Thread {
		@Override
		public void run() {
			System.out.println(String.format("The %s is started", getName()));

			try {
				Thread.sleep(2000);
				throw new InterruptedException();
			} catch (InterruptedException ie) {
				System.out.println("InterruptedException");
			}
		}
	}

	public static class Thread3 extends Thread {
		@Override
		public void run() {
			System.out.println(String.format("The %s is started", getName()));
			try {
				while (!Thread.currentThread().isInterrupted()) {
					System.out.println("���");
					Thread.sleep(500);
				}
			} catch (InterruptedException ie) {
			}
		}
	}

	public static class Thread4 extends Thread implements Message {

		public static volatile boolean isStopped = false;

		@Override
		public void run() {
			System.out.println(String.format("The %s is started", getName()));
			try {
				while (!isStopped) {
					Thread.sleep(2000);
					showWarning();
				}
			} catch (InterruptedException ie) {
				System.out.println(String.format("Thread # %s is interrupted", getName()));
			}
		}

		@Override
		public void showWarning() {
			isStopped = true;
		}
	}

	public static class Thread5 extends Thread {
		@Override
		public void run() {
			System.out.println(String.format("The %s is started", getName()));
			try {
				sum();
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
		}

		public static void sum() throws IOException {
			System.out.println("Enter your values:");
			BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
			int ans = 0;
			String line = null;
			while (!(line = bf.readLine()).equals("N")) {
				try {
					ans += Integer.valueOf(line);
				} catch (NumberFormatException nfe) {

				}
			}
			System.out.println(ans);
		}

	}

}
