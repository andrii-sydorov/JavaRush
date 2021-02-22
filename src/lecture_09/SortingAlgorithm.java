package lecture_09;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Задача: Пользователь вводит с клавиатуры список слов (и чисел). Слова вывести
 * в возрастающем порядке, числа - в убывающем.
 * 
 * Пример ввода: 
 * Вишня
 * 1 
 * Боб 
 * 3 
 * Яблоко 
 * 22 
 * 0 
 * Арбуз
 * 
 * Пример вывода: 
 * Арбуз 
 * 22 
 * Боб 
 * 3 
 * Вишня 
 * 1 
 * 0 
 * Яблоко
 * 
 * @author SMD_ASY
 *
 */
public class SortingAlgorithm {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<String> list = new ArrayList<>();
		String line = reader.readLine();
		while (!line.isEmpty()) {
			list.add(line);
			line = reader.readLine();
		}

		String[] array = list.toArray(new String[0]);
		sort(array);

		for (String x : array) {
			System.out.println(x);
		}
	}

	public static void sort(String[] array) {
		// making list for Integer and String
		ArrayList<Integer> lsIntVal = new ArrayList<>();
		ArrayList<Integer> lsIntInd = new ArrayList<>();
		ArrayList<String> lsStringVal = new ArrayList<>();
		ArrayList<Integer> lsStringInd = new ArrayList<>();
		for (int i = 0; i < array.length; i++) {
			if (isNumber(array[i])) {
				lsIntVal.add(Integer.valueOf(array[i]));
				lsIntInd.add(i);
			} else {
				lsStringVal.add(array[i]);
				lsStringInd.add(i);
			}
		}
		// sorting Integer
		ArrayList<Integer> copyInt = new ArrayList<>(lsIntVal);
		for (int i = 0; i < lsIntVal.size(); i++) {
			for (int j = 0; j < lsIntVal.size() - 1 - i; j++) {
				if (lsIntVal.get(j) <= lsIntVal.get(j + 1)) {
					Integer tempVal = lsIntVal.get(j);
					lsIntVal.set(j, lsIntVal.get(j + 1));
					lsIntVal.set(j + 1, tempVal);
				}
			}
		}
		// sorting String
		ArrayList<String> copyString = new ArrayList<>(lsStringVal);
		for (int i = 0; i < lsStringVal.size(); i++) {
			for (int j = 0; j < lsStringVal.size() - i - 1; j++) {
				if (isGreaterThan(lsStringVal.get(j), lsStringVal.get(j + 1))) {
					String tempVal = lsStringVal.get(j);
					lsStringVal.set(j, lsStringVal.get(j + 1));
					lsStringVal.set(j + 1, tempVal);
				}
			}
		}
		// making new array
		for (int i = 0; i < lsIntInd.size(); i++) {
			array[lsIntInd.get(i)] = Integer.toString(lsIntVal.get(i));
		}
		for (int i = 0; i < lsStringInd.size(); i++) {
			array[lsStringInd.get(i)] = lsStringVal.get(i);
		}
	}

	public static boolean isGreaterThan(String a, String b) {
		return a.compareTo(b) > 0;
	}
	
	/*
	 * the best solution
	 */
    public static void sort2(String[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (isNumber(array[i]) && isNumber(array[j])) {
                    if (Integer.parseInt(array[i]) < Integer.parseInt(array[j])) {
                        String temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                } else if (!isNumber(array[i]) && !isNumber(array[j])) {
                    if (isGreaterThan(array[i], array[j])) {
                        String temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                }
            }
        }
    }

	public static boolean isNumber(String text) {
		if (text.length() == 0) {
			return false;
		}

		char[] chars = text.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			char character = chars[i];

			if (i != 0 && character == '-') {
				return false;
			}

			if (!Character.isDigit(character) && character != '-') {
				return false;
			}

			if (chars.length == 1 && character == '-') {
				return false;
			}
		}

		return true;
	}
}
