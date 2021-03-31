package lecture_15.middle;

/**
 * Оцени наши машины и определи их в подходящую категорию — роскошное или
 * дешевое авто — и выведи результат. Для вывода используй только переменные из
 * класса Constants.
 * 
 * 	В классе Ferrari реализуй метод printlnDesire, чтобы он выводил на экран "Я
 * хочу ездить на Феррари".
 *  В классе Lanos реализуй метод printlnDesire, чтобы он выводил на экран "Я хочу ездить на Ланосе".
 *  Создай public static класс LuxuriousCar (РоскошнаяМашина).
 *  Создай public static класс CheapCar (ДешеваяМашина).
 *  Унаследуй Ferrari и Lanos от CheapCar и LuxuriousCar, подумай, какой класс для кого.
 *  В классе LuxuriousCar реализуй метод printlnDesire, чтобы он выводил на экран "Я хочу ездить на роскошной машине".
 * 	В классе CheapCar реализуйте метод printlnDesire, чтобы он выводил на экран "Я хочу ездить на дешевой машине".
 *  В классах LuxuriousCar и CheapCar для метода printlnDesire расставь различными способами модификаторы доступа так,
 * чтобы в классах Ferrari и Lanos выполнялось расширение видимости.
 * 
 * @author SMD_ASY
 *
 */
public class CarOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CarOverriding.LuxuriousCar().printlnDesire();
		new CarOverriding.CheapCar().printlnDesire();
		new CarOverriding.Ferrari().printlnDesire();
		new CarOverriding.Lanos().printlnDesire();
	}

	public static class LuxuriousCar {
		protected void printlnDesire() {
			System.out.println(Constants.WANT_STRING + "" + Constants.LUXURIOUS_CAR);
		}
	}

	public static class CheapCar {
		protected void printlnDesire() {
			System.out.println(Constants.WANT_STRING + "" + Constants.CHEAP_CAR);
		}
	}

	public static class Ferrari extends LuxuriousCar {
		@Override
		public void printlnDesire() {
			System.out.println(Constants.WANT_STRING + "" + Constants.FERRARI_NAME);
		}
	}

	public static class Lanos extends CheapCar {
		@Override
		public void printlnDesire() {
			System.out.println(Constants.WANT_STRING + "" + Constants.LANOS_NAME);
		}
	}

	public static class Constants {
		public static String WANT_STRING = "Я хочу ездить на ";
		public static String LUXURIOUS_CAR = "роскошной машине";
		public static String CHEAP_CAR = "дешевой машине";
		public static String FERRARI_NAME = "Феррари";
		public static String LANOS_NAME = "Ланосе";
	}

}
