package lecture_09;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Есть класс кот - Cat, с полем "имя" (String). 
 * Создать словарь Map<String,Cat> и добавить туда 10 котов в виде "Имя"-"Кот". 
 * Получить из Map множество(Set) всех котов и вывести его на экран.
 * 
 * @author SMD_ASY
 *
 */
public class MapToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Cat> map = createMap();
		Set<Cat> set = convertMapToSet(map);
		printCatSet(set);
	}

	public static Map<String, Cat> createMap() {
		Map<String, Cat> map = new HashMap<>();
		map.put("Barsik", new Cat("Barsik"));
		map.put("Tom", new Cat("Tom"));
		map.put("Pushok", new Cat("Pushok"));
		map.put("Chernish", new Cat("Chernish"));
		map.put("Bimm", new Cat("Bimm"));
		map.put("Cherry", new Cat("Cherry"));
		map.put("Cat", new Cat("Cat"));
		map.put("Kitty", new Cat("Kitty"));
		map.put("Donovan", new Cat("Donovan"));
		map.put("Kiss", new Cat("Kiss"));
		return map;
	}

	public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
		// Set<Cat> set = new HashSet<>(map.values());
		// return set;
		Set<Cat> set = new HashSet<>();
		for (String name : map.keySet()) {
			set.add(map.get(name));
		}
		return set;
	}

	public static void printCatSet(Set<Cat> set) {
		for (Cat cat : set) {
			System.out.println(cat);
		}
	}

	public static class Cat {
		private String name;

		public Cat(String name) {
			this.name = name;
		}

		public String toString() {
			return "Cat " + this.name;
		}
	}

}
