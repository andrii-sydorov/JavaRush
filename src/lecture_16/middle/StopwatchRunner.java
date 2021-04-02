package lecture_16.middle;

/**
 * 1. Разберись, что делает программа. 
 * 2. Реализуй логику метода doStep так, чтобы учитывалась скорость бегуна. 
 *  2.1. Метод getSpeed() в классе Runner показывает, сколько шагов в секунду делает бегун. Нужно, чтобы бегун действительно
 *   делал заданное количество шагов в секунду. Если Иванов делает 4 шага в секунду, то за 2 секунды он сделает 8 шагов. 
 *   Если Петров делает 2 шага в секунду, то за 2 секунды он сделает 4 шага. 
 * 	2.2. Метод sleep в классе Thread принимает параметр типа long.
 * 
 * ВАЖНО! Используй метод Thread.sleep(), а не Stopwatch.sleep().
 * 
 * @author SMD_ASY
 *
 */

public class StopwatchRunner {

	public static volatile boolean isStopped = false;

	public static void main(String[] args) throws InterruptedException {
		Runner ivanov = new Runner("Ivanov", 4);
		Runner petrov = new Runner("Petrov", 2);

		ivanov.start();
		petrov.start();
		Thread.sleep(2000);
		isStopped = true;
		Thread.sleep(1000);

	}

	public static class Stopwatch extends Thread {

		private int stepNumber;
		private Runner owner;

		public Stopwatch(Runner runner) {
			owner = runner;
		}

		public void run() {
			try {
				while (!isStopped) {
					doStep();
				}
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
		}

		public void doStep() throws InterruptedException {
			stepNumber++;
			// long sleepTime = owner.getSpeed() == 4 ? 250 : 500;
			Thread.sleep(1000 / owner.getSpeed());
			System.out.println(owner.getName() + " делает шаг №" + stepNumber + "!");
		}
	}

	public static class Runner {
		private Stopwatch stopwatch;
		private String name;
		private int speed;

		public Runner(String name, int speed) {
			this.name = name;
			this.speed = speed;
			this.stopwatch = new Stopwatch(this);
		}

		public String getName() {
			return this.name;
		}

		public int getSpeed() {
			return this.speed;
		}

		public void start() {
			stopwatch.start();
		}

	}

}
