package lecture_09;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.ArrayList;
import java.io.IOException;

/**
 * Написать программу, которая будет вводить числа с клавиатуры. Код по чтению
 * чисел с клавиатуры должен быть в методе readData. Код внутри readData
 * обернуть в try..catch. Если пользователь ввёл какой-то текст, вместо ввода
 * числа, то метод должен перехватить исключение и вывести на экран все ранее
 * введенные числа в качестве результата. Числа выводить с новой строки сохраняя
 * порядок ввода.
 * 
 * @author SMD_ASY
 *
 */
public class CorrectInput {
	public static void main(String[] args) {
		readData();
	}

	public static void readData() {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> ls = new ArrayList<Integer>();
		while (true) {
			try {
				ls.add(Integer.parseInt(bf.readLine()));
			} catch (IOException ie) {
			} catch (NumberFormatException nfe) {
				for (int i = 0; i < ls.size(); i++) {
					System.out.println(ls.get(i));
				}
				break;
			}
		}
	}
}
