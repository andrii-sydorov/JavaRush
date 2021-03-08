package lecture_16.easy;

/**
 * 1. Создать таск (public static класс SpecialThread, который реализует интерфейс Runnable). 
 * 2. SpecialThread должен выводить в консоль свой стек-трейс.
 * 
 * Подсказка: main thread уже выводит в консоль свой стек-трейс.
 * 
 * @author SMD_ASY
 *
 */

public class GetStackTrace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpecialThread specialThread = new SpecialThread();
		new Thread(specialThread).start();

		System.out.println("*****************");
	}

	public static class SpecialThread implements Runnable {
		@Override
		public void run() {
			for (StackTraceElement element : Thread.currentThread().getStackTrace()) {
				System.out.println(element);
			}
		}
	}

}
