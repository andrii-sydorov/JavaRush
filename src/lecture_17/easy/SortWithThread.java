package lecture_17.easy;

import java.util.List;
import java.util.ArrayList;

/**
 * 1. Разберись, что и как работает. 
 * 2. Создай public static нить SortThread, которая в методе run отсортирует 
 * статический массив testArray используя метод sort.
 * 
 * @author ASY
 *
 */

public class SortWithThread {

	public static int threadCount = 10;
	public static int[] testArray = new int[1000];

	static {
		for (int i = 0; i < testArray.length; i++) {
			testArray[i] = i;
		}
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		StringBuffer expectedResults = new StringBuffer();
		for (int i = 1000 - 1; i >= 0; i--) {
			expectedResults.append(i).append(" ");
		}

		initThreads();

		StringBuffer result = new StringBuffer();
		for (int i = 0; i < testArray.length; i++) {
			result.append(testArray[i]).append(" ");
		}
		System.out.println(result);
		System.out.println(expectedResults);
		System.out.println(result.toString().equals(expectedResults.toString()));

	}

	private static void initThreads() throws InterruptedException {
		List<Thread> threads = new ArrayList<Thread>(threadCount);
		for (int i = 0; i < threadCount; i++) {
			threads.add(new SortThread());
		}
		for (Thread t : threads) {
			t.start();
		}
		for (Thread t : threads) {
			t.join();
		}
	}

	public static int[] sort(int[] testArray) {
		for (int i = 0; i < testArray.length; i++) {
			for (int j = 0; j < testArray.length - i - 1; j++) {
				if (testArray[j] < testArray[j + 1]) {
					int temp = testArray[j];
					testArray[j] = testArray[j + 1];
					testArray[j + 1] = temp;
				}
			}
		}
		return testArray;
	}

	public static class SortThread extends Thread {
		public void run() {
			sort(testArray);
		}
	}

}
