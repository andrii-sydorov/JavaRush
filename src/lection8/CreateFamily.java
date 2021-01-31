package lection8;

import java.util.List;
import java.util.ArrayList;

/**
 * 1. ������ ����� Human � ������ ��� (String), ��� (boolean), ������� (int),
 * ���� (ArrayList<Human>). 
 * 2. ������ ������� � ������� �� ���, �����
 * ����������: ��� �������, ��� �������, ����, ����, ���� �����. 
 * 3. ������ ��� ������� Human �� ����� (���������: ��������� ����� toString() 
 * ������ Human).
 * 
 * @author SMD_ASY
 *
 */
public class CreateFamily {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// children
		Human child1 = new Human("david", true, 12);
		child1.children = new ArrayList<>(0);
		Human child2 = new Human("sony", false, 14);
		child2.children = new ArrayList<>(0);
		Human child3 = new Human("tania", false, 11);
		child3.children = new ArrayList<>(0);

		// father
		Human father = new Human("Pappy", true, 32);
		father.children = new ArrayList<>();
		father.children.add(child1);
		father.children.add(child2);
		father.children.add(child3);
		Human fatherGrandMother = new Human("Grammy", false, 62);
		fatherGrandMother.children = new ArrayList<>();
		fatherGrandMother.children.add(father);
		Human fatherGrandFather = new Human("Daddy", true, 63);
		fatherGrandFather.children = new ArrayList<>();
		fatherGrandFather.children.add(father);

		// mother
		Human mother = new Human("Mammy", false, 31);
		mother.children = new ArrayList<>();
		mother.children.add(child1);
		mother.children.add(child2);
		mother.children.add(child3);
		Human mothergGrandMother = new Human("Grammy", false, 62);
		mothergGrandMother.children = new ArrayList<>();
		mothergGrandMother.children.add(mother);
		Human motherGrandFather = new Human("Daddy", true, 63);
		motherGrandFather.children = new ArrayList<>();
		motherGrandFather.children.add(mother);

		// print
		System.out.println(fatherGrandFather);
		System.out.println(motherGrandFather);

		System.out.println(fatherGrandMother);
		System.out.println(mothergGrandMother);

		System.out.println(father);
		System.out.println(mother);

		System.out.println(child1);
		System.out.println(child2);
		System.out.println(child3);
	}

	public static class Human {
		// �������� ��� ��� ���
		String name;
		boolean sex;
		int age;
		ArrayList<Human> children;

		Human(String name, boolean sex, int age) {
			this.name = name;
			this.sex = sex;
			this.age = age;
		}

		public String toString() {
			String text = "";
			text += "���: " + this.name;
			text += ", ���: " + (this.sex ? "�������" : "�������");
			text += ", �������: " + this.age;

			int childCount = this.children.size();
			if (childCount > 0) {
				text += ", ����: " + this.children.get(0).name;

				for (int i = 1; i < childCount; i++) {
					Human child = this.children.get(i);
					text += ", " + child.name;
				}
			}
			return text;
		}
	}
}
