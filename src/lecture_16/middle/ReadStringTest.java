package lecture_16.middle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadStringTest {

	public static volatile BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Read3Strings t1 = new Read3Strings("First Thread");
		Read3Strings t2 = new Read3Strings("Second Thread");
		while (t1.isAlive() || t2.isAlive()) {
		}
		t1.printResult();
		t2.printResult();
	}

	public static synchronized String readString(int n) throws IOException {
		System.out.println(Thread.currentThread().getName() + " enter your's Strings");
		String result = "";
		for (int i = 0; i < n; i++) {
			result += bf.readLine() + " ";
		}
		return result.trim();
	}

	public static class Read3Strings extends Thread {
		private final int n = 3;
		private String ans = null;

		public Read3Strings(String name) {
			super(name);
			start();
		}

		public void run() {
			try {
				ans = readString(n);
			} catch (IOException ie) {
				ie.printStackTrace();
			}
		}

		public void printResult() {
			System.out.println(this.ans);
		}
	}

}
