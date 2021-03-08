package lecture_16.middle;

import java.util.List;
import java.util.ArrayList;

/**
 * 1. Разберись, что делает программа. 
 * 2. Реализуй логику метода printCountdown так, чтобы программа каждые полсекунды выводила объект из переменной list.
 * Выводить нужно в обратном порядке - от переданного в Countdown индекса до нуля.
 * 
 * Пример: Передан индекс 3
 * 
 * Пример вывода в консоль: Строка 2 Строка 1 Строка 0
 * 
 * @author SMD_ASY
 *
 */

public class CountDown {

	public static volatile List<String> list = new ArrayList<>();

	static {
		for (int i = 0; i < 5; i++) {
			list.add("Строка" + i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t = new Thread(new Countdown(3), "Countdown");
		t.start();
		System.out.println(t.getName());
	}

	public static class Countdown implements Runnable {

		private int countFrom;

		public Countdown(int countFrom) {
			this.countFrom = countFrom;
		}

		@Override
		public void run() {
			// TODO Auto-generated method stub
			try {
				while (countFrom > 0) {
					printCountdwon();
				}
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
		}

		public void printCountdwon() throws InterruptedException {
			countFrom--;
			System.out.println(list.get(countFrom));
			Thread.sleep(500);
		}

	}

}
