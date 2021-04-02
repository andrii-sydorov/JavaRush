package lecture_15.easy;

/**
 * Найди логическую ошибку: утка (Duck) должна корректно реализовывать интерфейс CanMove.
 * Исправь ошибку. Результат вывода в консоль должен быть таким: 
 * Flying
 * Moving
 * 
 * @author SMD_ASY
 *
 */

public class Ducks {
	public static void main(String[] args) {
		Duck duck = new Duck();
		Utily.fly(duck);
		Utily.move(duck);
	}

	public static class Duck implements CanMove, CanFly {

		@Override
		public void doAnotherAction() {
			System.out.println("Flying");
		}

		@Override
		public void doAction() {
			System.out.println("Moving");
		}

	}

	interface CanMove {
		void doAction();
	}

	interface CanFly {
		void doAnotherAction();
	}

	static class Utily {
		public static void fly(CanFly animal) {
			animal.doAnotherAction();
		}

		public static void move(CanMove animal) {
			animal.doAction();
		}
	}

}
