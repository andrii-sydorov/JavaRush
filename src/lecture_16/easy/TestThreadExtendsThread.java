package lecture_16.easy;

/**
 * 1. Создать public static класс TestThread, унаследованный от класса Thread.
 * 2. Создать статик блок внутри TestThread, который выводит в консоль "it's a static block inside TestThread". 
 * 3. Метод run должен выводить в консоль "it's a run method".
 * 
 * @author SMD_ASY
 *
 */

public class TestThreadExtendsThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestThread testThread = new TestThread();
		testThread.start();

	}

	public static class TestThread extends Thread {
		static {
			System.out.println("it's a static block inside TestThread");
		}

		@Override
		public void run() {
			System.out.println("it's a run method");
		}
	}

}
