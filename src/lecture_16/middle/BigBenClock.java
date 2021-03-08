package lecture_16.middle;

/**
 * 1. Разберись, что делает программа. 
 * 2. Реализуй логику метода printTime так, чтобы каждую секунду выдавалось время начиная с установленного в конструкторе.
 * 
 * Пример: 
 * В г. Лондон сейчас 23:59:58! 
 * В г. Лондон сейчас 23:59:59! 
 * В г. Лондон сейчас полночь! 
 * В г. Лондон сейчас 0:0:1!
 * 
 * @author SMD_ASY
 *
 */

public class BigBenClock {

	public static volatile boolean isStopped = false;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Clock clock = new Clock("Лондон", 23, 59, 57);
		Thread.sleep(4000);
		isStopped = true;
		Thread.sleep(1000);
	}

	public static class Clock extends Thread {
		private int seconds;
		private int minutes;
		private int hours;
		private String cityName;

		public Clock(String cityName, int hours, int minutes, int seconds) {
			this.seconds = seconds;
			this.minutes = minutes;
			this.hours = hours;
			this.cityName = cityName;
			start();
		}

		public void run() {
			try {
				while (!isStopped) {
					printTime();
				}
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
		}

		private void printTime() throws InterruptedException {
			this.seconds++;
			if (this.seconds >= 60) {
				this.minutes++;
				this.seconds = 0;
			}
			if (this.minutes >= 60) {
				this.hours++;
				this.minutes = 0;
			}
			if (this.hours >= 24) {
				this.hours = 0;
			}
			Thread.sleep(1000);
			String hour = String.valueOf(hours);
			String minute = String.valueOf(minutes);
			String second = String.valueOf(seconds);
			hour = hour.length() > 1 ? hour : "0" + hours;
			minute = minute.length() > 1 ? minute : "0" + minutes;
			second = second.length() > 1 ? second : "0" + seconds;
			if (this.hours == 0 && this.minutes == 0 && this.seconds == 0) {
				System.out.println(String.format("В г. %s сейчас полночь", this.cityName));
			} else {
				System.out.println(String.format("В г. %s сейчас %s:%s:%s ", this.cityName, hour, minute, second));
			}
		}
	}

}
