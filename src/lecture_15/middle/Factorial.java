package lecture_15.middle;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.io.IOException;

/**
 * Напиши метод, который вычисляет факториал - произведение всех чисел от 1 до
 * введенного числа, включая его.
 * 
 * Пример вычислений: 
 * 4! = factorial(4) = 1*2*3*4 
 * Пример вывода: 
 * 24
 * 
 * Для этого:
 * 
 * Введи с консоли число меньше либо равно 150. Реализуй функцию factorial. Если
 * введенное число меньше 0, выведи 0.
 * 
 * 0! = 1
 * 
 * @author SMD_ASY
 *
 */

public class Factorial {

	public static void main(String[] args) throws IOException {
		System.out.println("Enter your's number:");
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.valueOf(bf.readLine());
		System.out.println(fact(n));
	}

	public static String fact(int n) {
		if (n < 0) {
			return "0";
		}
		if (n <= 1) {
			return "1";
		}
		BigInteger pow = BigInteger.valueOf(1);
		for (int i = 2; i <= n; i++) {
			pow = pow.multiply(BigInteger.valueOf(i));
		}
		return String.valueOf(pow);
	}

}
