package lecture13.easy;

/**
 * Переделай наследование в классах и интерфейсах так, чтобы программа
 * компилировалась и продолжала делать то же самое. Класс Hobby должен
 * наследоваться от интерфейсов Desire, Dream.
 * 
 * 
 * 
 * @author SMD_ASY
 *
 */
public class SomeInterface {
	public static void main(String[] args) {
		System.out.println(Dream.HOBBY.toString()); // Обращаемся к интерфейсе, где уже создан обьект типа Hobby,
													// вызываем метод toString() у него
		System.out.println(Hobby.INDEX); // обращаемся к классу, который является статическим, и обращаемся к его
											// статическому полю
	}

	interface Desire {

	}

	interface Dream {
		public static Hobby HOBBY = new Hobby();
	}

	static class Hobby implements Desire, Dream {
		static int INDEX = 1;

		public String toString() {
			INDEX++;
			return "" + INDEX;
		}
	}
}
