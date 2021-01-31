package lection8;

import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;

/**
 * —оздать словарь (Map<String, String>) занести в него дес€ть записей по
 * принципу "фамили€" - "им€". ”далить людей, имеющих одинаковые имена.
 * 
 * @author SMD_ASY
 *
 */
public class DeletePeopleWithTheSameName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> mp = createMap();
		System.out.println("The map before deletening the people with the same name:");
		printMap(mp);
		System.out.println("The map after deleting the people with same name:");
		removeTheFirstNameDuplicates(mp);
		printMap(mp);
	}

	public static Map<String, String> createMap() {
		// напишите тут ваш код
		Map<String, String> map = new HashMap<>();
		map.put("sydorov", "andrii");
		map.put("stibliy", "andrii");
		map.put("shevchenko", "andrii");
		map.put("delikatov", "valerii");
		map.put("korinev", "pavel");
		map.put("trufanov", "ilia");
		map.put("bobov", "gleb");
		map.put("nuznii", "stas");
		map.put("nenuznii", "aleksei");
		map.put("tolmachev", "artur");
		return map;
	}

	public static void removeTheFirstNameDuplicates(Map<String, String> map) {
		// напишите тут ваш код
		Map<String, String> copy = new HashMap<>(map);
		List<String> ls = new ArrayList<String>();
		for (String key : copy.keySet()) {
			ls.add(copy.get(key));
		}
		for (int i = 0; i < ls.size(); i++) {
			String value = ls.get(i);
			for (int j = i + 1; j < ls.size(); j++) {
				if (ls.get(j).equals(value)) {
					removeItemFromMapByValue(map, value);
				}
			}
		}
	}

	public static void removeItemFromMapByValue(Map<String, String> map, String value) {
		Map<String, String> copy = new HashMap<>(map);
		for (Map.Entry<String, String> pair : copy.entrySet()) {
			if (pair.getValue().equals(value)) {
				map.remove(pair.getKey());
			}
		}
	}

	public static void printMap(Map<String, String> mp) {
		for (String key : mp.keySet()) {
			System.out.println(key + " " + mp.get(key));
		}
	}

}
