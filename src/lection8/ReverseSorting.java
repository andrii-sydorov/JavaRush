package lection8;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.io.IOException;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;

/**
 * Создать массив на 20 чисел. 
 * Заполнить его числами с клавиатуры. 
 * Вывести пять наибольших чисел.
 *  Каждое значение с новой строки.
 * 
 * @author SMD_ASY
 *
 */
public class ReverseSorting {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		final int n = 20;
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = Integer.valueOf(bf.readLine());
		}
		int[] copy1 = Arrays.copyOf(array, n);
		int[] copy2 = Arrays.copyOf(array, n);
		List<Integer> ls = new ArrayList(Arrays.asList(copy2));
		Collections.max(ls);
		Collections.reverse(ls);
		sort(copy1);
//		int[] sortCol = ls.stream().mapToInt(i -> i).toArray();
//		
//		System.out.println(Arrays.equals(copy1, sortCol));
		sort(array);
		final int m = 5;
		for (int i = 0; i < m; i++) {
			System.out.println(array[i]);
		}
	}

	public static void sort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - 1 - i; j++) {
				if (array[j] < array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
	}
}
