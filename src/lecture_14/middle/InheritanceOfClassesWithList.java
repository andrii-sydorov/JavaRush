package lecture_14.middle;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Давай напишем программу, которая будет давать имена всем котикам, выпускаемым
 * на нашей котофабрике. Для этого нужно:
 * 
 * 1) Считывать строки (параметры) с консоли, пока пользователь не введет пустую
 * строку (Enter). 
 * 2) Для каждого параметра (имени кота): 
 * - создать объект cat класса Cat, который равен коту из getCatByKey(String параметр). 
 * - вывести на экран cat.toString()
 * 
 * Для тестов: 
 * vaska 
 * murka 
 * kiska 
 * pirat
 * 
 * @author SMD_ASY
 *
 */
public class InheritanceOfClassesWithList {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String catName = bf.readLine();
		List<Cat> ls = new ArrayList<>();
		while (!catName.isEmpty()) {
			ls.add(CatFactory.getCatByKey(catName));
			catName = bf.readLine();
		}
		Iterator<Cat> it = ls.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

	static class CatFactory {
		static Cat getCatByKey(String key) {
			Cat cat = null;
			if ("vaska".equals(key)) {
				cat = new MaleCat("Василий");
			} else if ("murka".equals(key)) {
				cat = new FemaleCat("Мурочка");
			} else if ("kiska".equals(key)) {
				cat = new FemaleCat("Кисюлька");
			} else {
				cat = new Cat(key);
			}
			return cat;
		}
	}

	static class Cat {

		private String name;

		Cat(String name) {
			this.name = name;
		}

		public String getName() {
			return this.name;
		}

		public String toString() {
			return "Я уличный кот " + getName();
		}
	}

	static class MaleCat extends Cat {
		MaleCat(String name) {
			super(name);
		}

		public String toString() {
			return "Я - солидный кошак по имени " + getName();
		}

	}

	static class FemaleCat extends Cat {
		FemaleCat(String name) {
			super(name);
		}

		public String toString() {
			return "Я - милая кошечка по имени " + getName();
		}
	}
}
