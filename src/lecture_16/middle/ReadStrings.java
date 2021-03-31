package lecture_16.middle;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 1. � ������ Solution ������� public static ����� ���� Read3Strings ��������������� �� Thread. 
 * 2. � ������ run ����������� ������ � ������� ���� �����. 
 * 3. ��� ������ ��������� ������ ������ ����������� � ����� ���� � ������������ � ���� ������ ����� ������. 
 * 4. � ������ main ������� ��������� ��� ������ ����. 
 * 5. ��������� join.
 * 
 * ������:
 * 
 * ������� ������: 
 * a 
 * b 
 * c 
 * d 
 * e 
 * f
 * 
 * �������� ������: 
 * a b c 
 * d e f
 * 
 * @author ASY
 *
 */

public class ReadStrings {

	public static volatile BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// createOneThread();

		Read3Strings t1 = new Read3Strings("First Thread");
		Read3Strings t2 = new Read3Strings("Second Thread");
		t1.start();
		t1.join();
		t2.start();
		t2.join();

		t1.printResult();
		t2.printResult();
	}

	public static void createOneThread() {
		OneRead3Strings oner3s = new OneRead3Strings();
		while (oner3s.isAlive()) {
		}
		System.out.println(oner3s.getAns());
	}

	public static class OneRead3Strings extends Thread {
		private final int n = 3;
		private String ans = "";

		public OneRead3Strings() {
			start();
		}

		@Override
		public void run() {
			System.out.println("Enter you Strings:");
			try {
				for (int i = 0; i < n; i++) {
					String temp = bf.readLine();
					ans += temp + " ";
				}
			} catch (IOException ie) {
				ie.printStackTrace();
			} finally {
				ans.trim();
			}

		}

		public String getAns() {
			return this.ans;
		}
	}

	public static class Read3Strings extends Thread {
		private final int n = 3;
		private String ans = "";

		public Read3Strings(String name) {
			super(name);
		}

		@Override
		public void run() {
			System.out.println(Thread.currentThread().getName() + "enter your's lines");
			try {
				for (int i = 0; i < n; i++) {
					ans += bf.readLine() + " ";
				}
			} catch (IOException ie) {
				ie.printStackTrace();
			} finally {
				ans.trim();
			}
		}

		public void printResult() {
			System.out.println(this.ans);
		}
	}
}
