package lecture_15.middle;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * В этой задаче тебе нужно:
 * 
 * В статическом блоке считать с консоли А и В — две переменные с типом int.
 * Обработать IOException в блоке catch. 
 * Закрыть поток ввода методом close().
 * 
 * @author SMD_ASY
 *
 */

public class StaticInit {
	// инициализация по умолчанию
	public static int A;
	public static int B;
	// определение статических переменных должна происходит раньше их использования в методе
	static {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		try {
			A = Integer.valueOf(bf.readLine());
			B = Integer.valueOf(bf.readLine());
		} catch (IOException ioe) {

		}
	}

	public static int min = MIN(A, B);

	public static void main(String[] args) {
		System.out.println(min);
	}

	public static int MIN(int a, int b) {
		return a >= b ? b : a;
	}
}
