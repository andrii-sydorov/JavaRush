package lecture_15.hard;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * В этой задаче тебе нужно:
 * 
 * Считывать с консоли данные, пока не будет введено слово "exit". 
 * Для каждого значения, кроме "exit", вызвать метод print().
 * Если значение: содержит точку '.', вызвать метод print() для Double; 
 * больше нуля, но меньше 128, вызвать метод print() для short; 
 * меньше либо равно нулю или больше либо равно 128, вызвать метод print() для Integer; 
 * иначе — вызвать метод print() для String.
 * 
 * @author SMD_ASY
 *
 */

public class Methodoverloading {

	public static void main(String[] args) throws IOException {
		System.out.println("Enter your's value:");
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String value = null;
		while (!(value = bf.readLine()).equals("exit")) {
			double valueDouble = 0;
			try {
				valueDouble = Double.valueOf(value);
			} catch (NumberFormatException nfe) {
				print(value);
				continue;
			}
			if (value.contains(".")) {
				print(valueDouble);
			} else if (Integer.valueOf(value) > 0 && Integer.valueOf(value) < 128) {
				print(Short.valueOf(value));
			} else {
				print(Integer.valueOf(value));
			}
		}

	}

	public static void print(Double value) {
		System.out.println("Это тип Double, значение " + value);
	}

	public static void print(String value) {
		System.out.println("Это тип String, значение " + value);
	}

	public static void print(short value) {
		System.out.println("Это тип short, значение " + value);
	}

	public static void print(Integer value) {
		System.out.println("Это тип Integer, значение " + value);
	}

}
