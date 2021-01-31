package lection8;

import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;

public class SamePeople {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "aleksei";
		String surname = "belonenko";
		Map<String, String> map = createMap();
		System.out.println(getCountTheSameFirstName(map, surname));
		System.out.println(getCountTheSameLastName(map, name));
	}

	public static Map<String, String> createMap() {
		Map<String, String> map = new HashMap<>();
		map.put("Смирнов", "Сильвестр");
		map.put("Иванов", "Дмитрий");
		map.put("Кузнецов", "Арнольд");
		map.put("Соколов", "Роман");
		map.put("Попов", "Максим");
		map.put("Лебедев", "Ярослав");
		map.put("Новиков", "Александр");
		map.put("Козлов", "Михаил");
		map.put("Морозов", "Илья");
		map.put("Петров", "Алексей");
		return map;
	}

	public static int getCountTheSameFirstName(Map<String, String> map, String name) {
		// напишите тут ваш код
		int count = 0;
		for (Map.Entry<String, String> pair : map.entrySet()) {
			if (pair.getValue().equals(name)) {
				count++;
			}
		}
		return count;
	}

	public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
		// напишите тут ваш код
		int count = 0;
		Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, String> pair = it.next();
			if (pair.getKey().equals(lastName)) {
				count++;
			}
		}
		return count;
	}
}
