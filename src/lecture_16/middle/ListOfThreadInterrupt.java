package lecture_16.middle;

import java.util.List;
import java.util.ArrayList;

/**
 * 1. Разберись, как работает программа. 
 *  1.1. Обрати внимание, что объект Water - один для всех нитей. 
 * 2. Реализуй метод ourInterruptMethod, чтобы он прерывал все нити из threads. 
 * 3. В методе run исправь значения переменных:
 * 	3.1. isCurrentThreadInterrupted - должна равняться значению метода isInterrupted у текущей нити. 
 * 	3.2. threadName - должна равняться значению метода getName (реализовано в классе Thread) у текущей нити.
 * 
 * @author SMD_ASY
 *
 */

public class ListOfThreadInterrupt {

	public static byte byteCount = 3;
	public static List<Thread> list = new ArrayList<>(byteCount);

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		initThreadsAndStart();
		Thread.sleep(3000);
		ourInterruptMethod();
	}

	public static void ourInterruptMethod() {
		for (int i = 0; i < byteCount; i++) {
			list.get(i).interrupt();
		}
	}

	public static void initThreadsAndStart() {
		Water water = new Water("water");
		for (int i = 0; i < byteCount; i++) {
			list.add(new Thread(water, "#" + i));
		}
		for (int i = 0; i < byteCount; i++) {
			list.get(i).start();
		}
	}

	public static class Water implements Runnable {

		private String sharedResource;

		public Water(String sharedResource) {
			this.sharedResource = sharedResource;
		}

		public void run() {

			boolean isCurrentThreadInterrupted = Thread.currentThread().isInterrupted();
			String threadName = Thread.currentThread().getName();
			try {
				while (!isCurrentThreadInterrupted) {
					System.out.println("Обьект " + sharedResource + ", нить " + threadName);
					Thread.sleep(1000);
				}
			} catch (InterruptedException ie) {

			}
		}

	}

}
