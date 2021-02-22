package lecture_14.middle;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * ����� ������� ���������, ������� ����� ������ ����� ���� �������, �����������
 * �� ����� �����������. ��� ����� �����:
 * 
 * 1) ��������� ������ (���������) � �������, ���� ������������ �� ������ ������
 * ������ (Enter). 
 * 2) ��� ������� ��������� (����� ����): 
 * - ������� ������ cat ������ Cat, ������� ����� ���� �� getCatByKey(String ��������). 
 * - ������� �� ����� cat.toString()
 * 
 * ��� ������: 
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
				cat = new MaleCat("�������");
			} else if ("murka".equals(key)) {
				cat = new FemaleCat("�������");
			} else if ("kiska".equals(key)) {
				cat = new FemaleCat("��������");
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
			return "� ������� ��� " + getName();
		}
	}

	static class MaleCat extends Cat {
		MaleCat(String name) {
			super(name);
		}

		public String toString() {
			return "� - �������� ����� �� ����� " + getName();
		}

	}

	static class FemaleCat extends Cat {
		FemaleCat(String name) {
			super(name);
		}

		public String toString() {
			return "� - ����� ������� �� ����� " + getName();
		}
	}
}
