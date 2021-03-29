package lecture_16.hard;

import java.util.List;
import java.util.ArrayList;

/**
 * “ри человека играют в игру.  аждый игрок(Gamer) характеризуетс€ двум€
 * параметрами: фамилией(name) и количеством действий в секунду (rating). 
 * Ќужно вывести в консоль ход игры и определить победител€ и проигравших. »так... 
 * 1.–азберись, что делает программа.
 *  1.1. List<String> steps хранит последовательность действий, которое каждый игрок выполн€ет от 0 до
 * последнего. 
 *  1.2. isWinnerFound показывает, найден победитель или нет. 
 *  1.3. ћетод sleep выбрасывает InterruptedException и принимает параметр типа long.
 *  1.4. »гроки играют независимо друг от друга. 
 * 2. –еализуй логику метода run так, чтобы дл€ каждого игрока:
 *  2.1. „ерез равные интервалы времени (1000ms / rating) выводились в консоль действи€, описанные в steps.
 *  2.2. Ћюбой текст должен начинатьс€ с фамилии игрока (метод getName()), потом следовать
 * двоеточие, а затем сам текст.
 * 
 * ѕример: Ivanov:Ќачало игры
 * 
 *  2.3.  огда игрок выполнит все действи€ из steps, то он считаетс€ победителем.
 * ¬ыведи getName() + ":победитель!" 
 *  2.4.  огда найден победитель, то игра останавливаетс€, и остальные игроки считаютс€ побежденными. ¬ыведи дл€ них
 * getName() + ":проиграл"
 * 
 * @author SMD_ASY
 *
 */

public class Gamers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OnlineGame onlineGame = new OnlineGame();
		onlineGame.start();
	}

	public static class OnlineGame extends Thread {

		public static volatile boolean isWinnerFound = false;

		public static List<String> steps = new ArrayList<String>();

		static {
			steps.add("Ќачало игры");
			steps.add("—бор ресурсов");
			steps.add("–ост экономики");
			steps.add("”бийство врагов");
		}

		protected Gamer gamer1 = new Gamer("Ivanov", 3);
		protected Gamer gamer2 = new Gamer("Petrov", 1);
		protected Gamer gamer3 = new Gamer("Sydorov", 5);

		public void run() {
			gamer1.start();
			gamer2.start();
			gamer3.start();
			while (!isWinnerFound) {
			}
			gamer1.interrupt();
			gamer2.interrupt();
			gamer3.interrupt();
		}

	}

	public static class Gamer extends Thread {
		private int rating;

		public Gamer(String name, int rating) {
			super(name);
			this.rating = rating;
		}

		public void run() {
			try {
				for (int i = 0; i < OnlineGame.steps.size(); i++) {
					System.out.println(getName() + ":" + OnlineGame.steps.get(i));
					Thread.sleep(1000 / rating);
				}
				if (!OnlineGame.isWinnerFound) {
					OnlineGame.isWinnerFound = true;
					System.out.println(getName() + ":" + "победитель!");
				}
			} catch (InterruptedException ie) {
				System.out.println(getName() + ":" + "проиграл");
			}
		}
	}

}
