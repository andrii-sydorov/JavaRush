package lecture_13.hard;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * В этой задаче тебе нужно:
 * 
 * Ввести имя файла с консоли. Прочитать из него набор чисел. Вывести в консоли
 * только четные, отсортированные по возрастанию.
 * 
 * Пример ввода: 
 * 5 
 * 8 
 * -2 
 * 11 
 * 3 
 * -5 
 * 2 
 * 10
 * 
 * Пример вывода: 
 * -2 
 * 2 
 * 8 
 * 10
 * 
 * @author ASY
 *
 */
public class SortedOddNumbersFromFile {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Enter the path to file:");
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String fileName = bf.readLine();
		Scanner sc = new Scanner(new FileInputStream(fileName));
		List<Integer> ls = new ArrayList<>();
		while (sc.hasNext()) {
			int toBeAdded = sc.nextInt();
			if (toBeAdded % 2 == 0) {
				ls.add(toBeAdded);
			}
		}
		Collections.sort(ls);
		for (Integer i : ls) {
			System.out.println(i);
		}
		sc.close();
		bf.close();
	}

}
