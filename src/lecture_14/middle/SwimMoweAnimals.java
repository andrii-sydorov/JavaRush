package lecture_14.middle;

/**
 * �������, 8 ������
 * 
 * ����� ������� ���������, ������� ���������, ��� ����� ������ ������ ������:
 * 
 * 	�������, ��� ������� ���������� Swimmable (�������� �������) � Walkable (�������� ������) � ������� OceanAnimal (�������� ������). 
 * 	��������� �������� ������������ ����������� � ������ OceanAnimal. 
 * 	�������, ��� ����� ���� ������� ������ Orca (�������), Whale (���), Otter (�����) � ������� OceanAnimal. 
 * 	�������� ��������� ������������ ����� �������� Orca, Whale, Otter � ������� OceanAnimal.
 *  �������, ����� ����� ������ ����������� ��������� Walkable � �������� ��������� ����� ������.
 *  �������, ����� �������� ��� �� ����� ������� � �������� ��� ��������� Swimmable.
 * 
 * @author ASY
 *
 */

public class SwimMoweAnimals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Swimmable animal = new Orca();
		animal.swim();
		animal = new Whale();
		animal.swim();
		animal = new Otter();
		animal.swim();
	}

	public static void test(Swimmable animal) {
		animal.swim();
	}

	interface Walkable {
		void walk();
	}

	interface Swimmable {
		void swim();
	}

	static abstract class OceanAnimal implements Swimmable {
		public void swim() {
			OceanAnimal currentAnimal = (OceanAnimal) getCurrentAnimal();
			currentAnimal.displaySwim();
		}

		private void displaySwim() {
			System.out.println(getCurrentAnimal().getClass().getSimpleName() + " is swimming");
		}

		abstract Swimmable getCurrentAnimal();
	}

	static class Orca extends OceanAnimal {
		@Override
		public Swimmable getCurrentAnimal() {
			return this;
		}

	}

	static class Whale extends OceanAnimal {
		@Override
		public Swimmable getCurrentAnimal() {
			return this;
		}

	}

	static class Otter implements Walkable, Swimmable {
		public void walk() {
			System.out.println("Walk");
		}

		public void swim() {
			System.out.println("Swim");
		}
	}

}
