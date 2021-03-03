package lecture_15.middle;

import java.util.List;
import java.util.ArrayList;

/**
 * Исправь метод containsBones() и всю связанную с ним логику так, чтобы: 
 *  1. Поведение программы осталось прежним.
 *  2. Метод containsBones() возвращал тип Object и значение "Yes" вместо true, "No" — вместо false.
 * 
 * @author SMD_ASY
 *
 */

public class HumanParts {

	public static void main(String[] args) {
		printlnFingers();
		printlnBodyParts();
		printlnLivingParts();
	}

	private static void printlnLivingParts() {
		System.out.println(new BodyPart("Рука").containsBones());
	}

	private static void printlnBodyParts() {
		List<BodyPart> bodyParts = new ArrayList<BodyPart>(5);
		bodyParts.add(new BodyPart("Рука"));
		bodyParts.add(new BodyPart("Нога"));
		bodyParts.add(new BodyPart("Голова"));
		bodyParts.add(new BodyPart("Тело"));
		System.out.println(bodyParts.toString());
	}

	public static void printlnFingers() {
		List<Finger> fingers = new ArrayList<Finger>(5);
		fingers.add(new Finger("Большой", true));
		fingers.add(new Finger("Указательный", true));
		fingers.add(new Finger("Средний", true));
		fingers.add(new Finger("Безымянный", false));
		fingers.add(new Finger("Мизинец", true));
		System.out.println(fingers.toString());
	}

	public static interface LivingPart {
		Object containsBones();
	}

	public static class BodyPart implements LivingPart {

		private String name;

		public BodyPart(String name) {
			this.name = name;
		}

		@Override
		public Object containsBones() {
			return new String("Yes");
		}

		public String toString() {
			return containsBones().equals("Yes") ? name + " содержит кости" : name + " не содержит кости";
		}
	}

	public static class Finger extends BodyPart {

		private boolean isArtficial;

		public Finger(String name, boolean isArtficial) {
			super(name);
			this.isArtficial = isArtficial;
		}

		@Override
		public Object containsBones() {
			return isArtficial ? "Yes" : "No";
		}

	}

}
