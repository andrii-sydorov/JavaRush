package lecture13.easy;

/**
 * ��������� ������������ � ������� � ����������� ���, ����� ���������
 * ��������������� � ���������� ������ �� �� �����. ����� Hobby ������
 * ������������� �� ����������� Desire, Dream.
 * 
 * 
 * 
 * @author SMD_ASY
 *
 */
public class SomeInterface {
	public static void main(String[] args) {
		System.out.println(Dream.HOBBY.toString()); // ���������� � ����������, ��� ��� ������ ������ ���� Hobby,
													// �������� ����� toString() � ����
		System.out.println(Hobby.INDEX); // ���������� � ������, ������� �������� �����������, � ���������� � ���
											// ������������ ����
	}

	interface Desire {

	}

	interface Dream {
		public static Hobby HOBBY = new Hobby();
	}

	static class Hobby implements Desire, Dream {
		static int INDEX = 1;

		public String toString() {
			INDEX++;
			return "" + INDEX;
		}
	}
}
