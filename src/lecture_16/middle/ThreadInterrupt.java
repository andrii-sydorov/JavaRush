package lecture_16.middle;

/**
 * Разберись, как работает программа. Сделай так, чтобы в методе
 * ourInterruptMethod можно было сделать так, чтобы нить TestThread завершилась
 * сама. Нельзя использовать метод interrupt.
 * 
 * @author SMD_ASY
 *
 */

public class ThreadInterrupt {

	public static volatile boolean isFinished = false;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Thread t = new Thread(new TestThread());
		t.start();
		Thread.sleep(3000);
		ourInterruptMethod();
	}

	public static void ourInterruptMethod() {
		isFinished = true;
	}

	public static class TestThread implements Runnable {
		public void run() {
			while (!isFinished) {
				try {
					System.out.println("he-he");
					Thread.sleep(500);
				} catch (InterruptedException e) {
				}
			}
		}
	}

}
