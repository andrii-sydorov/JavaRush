package lecture_15.middle;

import java.util.List;
import java.util.ArrayList;

/**
 * ������� ����� containsBones() � ��� ��������� � ��� ������ ���, �����: 
 *  1. ��������� ��������� �������� �������.
 *  2. ����� containsBones() ��������� ��� Object � �������� "Yes" ������ true, "No" � ������ false.
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
		System.out.println(new BodyPart("����").containsBones());
	}

	private static void printlnBodyParts() {
		List<BodyPart> bodyParts = new ArrayList<BodyPart>(5);
		bodyParts.add(new BodyPart("����"));
		bodyParts.add(new BodyPart("����"));
		bodyParts.add(new BodyPart("������"));
		bodyParts.add(new BodyPart("����"));
		System.out.println(bodyParts.toString());
	}

	public static void printlnFingers() {
		List<Finger> fingers = new ArrayList<Finger>(5);
		fingers.add(new Finger("�������", true));
		fingers.add(new Finger("������������", true));
		fingers.add(new Finger("�������", true));
		fingers.add(new Finger("����������", false));
		fingers.add(new Finger("�������", true));
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
			return containsBones().equals("Yes") ? name + " �������� �����" : name + " �� �������� �����";
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
