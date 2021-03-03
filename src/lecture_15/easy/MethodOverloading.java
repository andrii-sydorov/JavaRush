package lecture_15.easy;

/**
 * Убери в методе main() лишние строки, для которых метод add() не реализован.
 * 
 * @author SMD_ASY
 *
 */
public class MethodOverloading {

	public static void main(String[] args) {
		add((short) 1, 2f); // short -> int, float -> double => int + double
		add(1, 2); // int + int
		add(2d, 2); // double, + int -> double => double + double
		// add("1", 2d);
		add((byte) 1, 2d);// byte -> int => int + double
	}

	public static void add(int i, int j) {
		System.out.println("Integer addition");
	}

	public static void add(int i, double j) {
		System.out.println("Integer and double addition");
	}

	public static void add(double i, double j) {
		System.out.println("Double addition");
	}

}
