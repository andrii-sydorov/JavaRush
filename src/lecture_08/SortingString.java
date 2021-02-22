package lecture_08;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.io.IOException;

/**
 * Задача: Введи с клавиатуры 20 слов и выведи их в алфавитном порядке. 
 * Каждое слово - с новой строки.
 * 
 * @author SMD_ASY
 *
 */
public class SortingString {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String[] array = new String[20];
		for (int i = 0; i < array.length; i++) {
			array[i] = reader.readLine();
		}
		String[] arrayCopy = Arrays.copyOf(array, array.length);

		sort1(array);
		sort2(arrayCopy);

		for (int i = 0; i < 20; i++) {
			System.out.println(array[i] + " " + arrayCopy[i]);
		}

	}

	public static void sort1(String[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - 1 - i; j++) {
				int minLength = Math.min(array[j].length(), array[j + 1].length());
				if (isGreaterThan(array[j].substring(0, minLength), array[j + 1].substring(0, minLength))) {
					String temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				} else {
					continue;
				}
			}
		}
	}

	public static void sort2(String[] array) {
		// напишите тут ваш код
		for (int i = 0; i < array.length; i++) {
			for (int j = i; j < array.length; j++) {
				if (isGreaterThan(array[i], array[j])) {
					String temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
	}

	public static boolean isGreaterThan(String a, String b) {
		return a.compareTo(b) > 0;
	}
}
