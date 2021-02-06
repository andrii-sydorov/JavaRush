package lection9;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;

/**
 * Создать список, элементами которого будут массивы чисел. Добавить в список
 * пять объектов-массивов длиной 5, 2, 4, 7, 0 соответственно. Заполнить массивы
 * любыми данными и вывести их на экран.
 * 
 * @author SMD_ASY
 *
 */

public class FillTheListOfArrays {

	public static void main(String[] args) {
		List<int[]> list = createList();
		printList(list);
	}

	public static ArrayList<int[]> createList() {
		ArrayList<int[]> ls = new ArrayList<>();
		Random r = new Random();
		int[] random = new int[] { 5, 2, 4, 7, 0 };
		int[][] arrays = new int[random.length][];
		for (int i = 0; i < random.length; i++) {
			arrays[i] = new int[random[i]];
			for (int j = 0; j < random[i]; j++) {
				arrays[i][j] = r.nextInt(10);
			}
			ls.add(arrays[i]);
		}
		return ls;
	}

	public static void printList(List<int[]> ls) {
		for (int i = 0; i < ls.size(); i++) {
			int[] temp = ls.get(i);
			for (int j = 0; j < temp.length; j++) {
				System.out.println(temp[j]);
			}
		}
	}
}
