package lecture_16.hard;

/**
 * 1. Разберись, что делает программа. 
 * 2. Реализуй логику метода run так, чтобы каждую секунду через пробел выдавался отсчет начиная с numSeconds до 1, а
 * потом слово [Марш!] (см примеры). 
 * 3. Если нить работает 3.5 секунды или более, прерви ее методом interrupt и внутри нити выведи в консоль слово
 * [Прервано!].
 * 
 * Пример для numSeconds=4 : 
 * "4 3 2 1 Прервано!"
 * 
 * 4. Если нить работает менее 3.5 секунд, она должна завершиться сама. Пример
 * для numSeconds=3 : 
 * "3 2 1 Марш!"
 * 
 * PS: метод sleep выбрасывает InterruptedException.
 * 
 * @author SMD_ASY
 *
 */

public class RacesReport {

	public static volatile int numberSeconds = 4;
	
	public static volatile boolean isFinished = false;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		RacingClock clock = new RacingClock();
		Thread.sleep(3500);
		clock.interrupt();
		if (!clock.isInterrupted()) {
			System.out.print("Марш!");
		} else {
			System.out.print("Прервано!");
		}
	}

	public static class RacingClock extends Thread {

		public RacingClock() {
			start();
		}

		@Override
		public void run() {
//			long start = System.currentTimeMillis();

			try {
				while (!Thread.currentThread().isInterrupted() && numberSeconds > 0) {
					System.out.print(numberSeconds + " ");
					Thread.sleep(1000);
					numberSeconds--;
				}
			} catch (InterruptedException ie) {
			}
		}
//			long stop = System.currentTimeMillis();
//			if (stop - start >= 3500) {
//				Thread.currentThread().interrupt();
//			}
//			if (!Thread.currentThread().isInterrupted()) {
//				System.out.println("Марш!");
//			} else {
//				System.out.print("Прервано!");
//			}
	}
}
