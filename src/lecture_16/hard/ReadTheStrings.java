package lecture_16.hard;

import java.util.List;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.concurrent.atomic.*;

/**
 * 1. ���������, ��� ������ ���������.
 *  1.1. ������ ���� ������ ������ � ������� ������. ��������� ������� static BufferedReader reader.
 *  1.2. ��������� AtomicInteger readStringCount, ����� ���������, ������� ����� ��� ������� �
 * ������� ����� ������. 
 * 2. �������� ������ ������ run:
 *  2.1. ���� ���� �� �������� (!isInterrupted) ����� � ������� ������ � �������� �� � ����
 * List<String> result.
 *  2.2. ��������� readStringCount ��� �������� ��� ��������� � ������� �����.
 * 
 * @author SMD_ASY
 *
 */

public class ReadTheStrings {

	public static volatile BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	public static volatile AtomicInteger readStringCount = new AtomicInteger(0);

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int count = Integer.valueOf(reader.readLine());

		ReaderThread consolReader1 = new ReaderThread();
		ReaderThread consolReader2 = new ReaderThread();
		ReaderThread consolReader3 = new ReaderThread();

		consolReader1.start();
		consolReader2.start();
		consolReader3.start();

		while (count > readStringCount.get()) {

		}

		consolReader1.interrupt();
		consolReader2.interrupt();
		consolReader3.interrupt();

		System.out.println("#1: " + consolReader1);
		System.out.println("#2: " + consolReader2);
		System.out.println("#3: " + consolReader3);

		reader.close();
	}

	public static class ReaderThread extends Thread {
		private List<String> results = new ArrayList<>();

		@Override
		public void run() {
			try {
				while (!isInterrupted()) {
					if (reader.ready()) {
						results.add(reader.readLine());
						readStringCount.incrementAndGet();
					}
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		@Override
		public String toString() {
			return results.toString();
		}
	}
}
