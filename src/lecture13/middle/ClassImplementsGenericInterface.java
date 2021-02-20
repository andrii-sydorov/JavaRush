package lecture13.middle;

/**
 * Создай класс StringObject и реализуй в нем интерфейс SimpleObject с
 * параметром типа String. Программа должна компилироваться
 * 
 * @author SMD_ASY
 *
 */

public class ClassImplementsGenericInterface {
	public static void main(String[] args) {

	}

	interface SimpleObject<T> {
		SimpleObject<T> getInstance();
	}

	static class StringObject implements SimpleObject<String> {
		public SimpleObject<String> getInstance() {
			return null;
		}
	}
}
