package lecture_14.middle;

/**
 * уровень, 8 лекция
 * 
 * Давай напишем программу, которая определит, что умеют делать жители океана:
 * 
 * 	Подумай, как связаны интерфейсы Swimmable (способен плавать) и Walkable (способен ходить) с классом OceanAnimal (животное океана). 
 * 	Правильно расставь наследование интерфейсов и класса OceanAnimal. 
 * 	Подумай, как могут быть связаны классы Orca (Косатка), Whale (Кит), Otter (Выдра) с классом OceanAnimal. 
 * 	Расставь правильно наследование между классами Orca, Whale, Otter и классом OceanAnimal.
 *  Подумай, какой класс должен реализовать интерфейс Walkable и добавить интерфейс этому классу.
 *  Подумай, какое животное еще не умеет плавать и добавить ему интерфейс Swimmable.
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
