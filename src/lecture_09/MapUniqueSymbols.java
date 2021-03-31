package lecture_09;

import java.util.Map;
import java.util.HashMap;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/**
 * Мама Функциональности маловато!
 * 
 * Программа вводит с клавиатуры пару (число и строку) и выводит их на экран.
 * Нужно сделать так, чтобы программа вводила с клавиатуры пары (число и строку)
 * и сохраняла их в HashMap.
 * 
 * Ключевые требования:
 * 
 * Пустая строка - конец ввода данных. Числа могут повторяться. Строки всегда
 * уникальны. Введенные данные не должны потеряться!
 * 
 * Затем программа должна выводить содержание HashMap на экран. Каждую пару - с
 * новой строки.
 * 
 * Пример ввода: 1 Мама 2 Рама 1 Мыла
 * 
 * Пример вывода: 1 Мыла 2 Рама 1 Мама
 * 
 * @author SMD_ASY
 *
 */

public class MapUniqueSymbols {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Map<String, Integer> map = buildMap2();
		Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry<String, Integer> it = iterator.next();
			System.out.println("Id= " + it.getValue() + " Name= " + it.getKey());
		}
		/*
		 * only for test ArrayList<String> 
		 * t = new ArrayList<>(Arrays.asList(new String[] {"A", "B", "C"}));
		 * ArrayList<String>[] arrayOfLists = new ArrayList[size];
		 */
		
	}

	/*
	 * my solution, more difficult, because I observe all input's lines
	 */
	public static Map<String, Integer> buildMap() throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		Map<String, Integer> map = new HashMap<>();
		List<String> list = new ArrayList<>();
		while (true) {
			String exit = bf.readLine();
			if (exit.isEmpty()) {
				break;
			}
			list.add(exit);
		}
		for (int i = 0; i < list.size(); i += 2) {
			if (list.size() % 2 != 0 && i == list.size() - 1) {
				map.put(null, Integer.valueOf(list.get(i)));
			} else {
				map.put(list.get(i + 1), Integer.valueOf(list.get(i)));
			}
		}
		return map;
	}

	/*
	 * according the solution from JavaRush
	 */
	public static Map<String, Integer> buildMap2() throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		Map<String, Integer> map = new HashMap<>();
		while (true) {
			String temp = bf.readLine();
			if (temp.isEmpty()) {
				break;
			}
			int id = Integer.valueOf(temp);
			String name = bf.readLine();
			map.put(name, id);
		}
		return map;
	}

}
