package lection9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * Наша программа демонстрирует работу HashMap: вводит с клавиатуры набор пар
 * (номер и строку), помещает их в HashMap и выводит на экран содержимое
 * HashMap. Нужно исправить программу так, чтобы она скомпилировалась.
 * 
 * @author SMD_ASY
 *
 */

public class MapInsert {
	HashMap<Integer, String> map;
	static Integer index;
	static String name;

	public MapInsert() {
		this.map = new HashMap<Integer, String>();
		map.put(index, name);
	}

	public static void main(String[] args) throws IOException {
		MapInsert solution = new MapInsert();
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		solution.map.clear();

		for (int i = 0; i < 10; i++) {
			int index = Integer.parseInt(reader.readLine());
			String name = reader.readLine();
			solution.map.put(index, name);
		}

		for (Map.Entry<Integer, String> pair : solution.map.entrySet()) {
			index = pair.getKey();
			name = pair.getValue();
			System.out.println("Id=" + index + " Name=" + name);
		}
	}
}
