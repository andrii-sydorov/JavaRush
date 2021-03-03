package lecture_15.easy;

/**
 * ����� ���������� ���� ������ �������, ����� ����� ��������� �������� ���: ���
 * double ��� Object ��� double ��� Integer ��� double
 * 
 * @author SMD_ASY
 *
 */
public class TypeConversation {

	public static void main(String[] args) {
		print((short) 1);
		print((Number) 1);
		print(1);
		print((Integer) 1);
		print(1);
	}

	public static void print(Integer i) {
		System.out.println("��� Integer");
	}

	public static void print(Object i) {
		System.out.println("��� Object");
	}

	public static void print(double i) {
		System.out.println("��� double");
	}

	// my changes
	// ��� ���������� ������� ������� ���������� ���������� �� ����������, � �����
	// ��� �� ������� �������, ������ �� ����� ��������� print((short) 1);
	// ����� "��� double", ���� �� ���������������� ���������� ����� double, �� �
	// ������� �������� "��� Short"
	/*
	 * ������� �������� �����������: byte->short->int->long->float->double. ���� ��
	 * ����� ���������� �����, �� ����� ������������� � ���� ������ (int->Integer ,
	 * short -> Short �.�.�) � ���� ������ ���. ���� �� �������, �������� (���
	 * ������ ��������) �� Number, � ����� �� Object.
	 * 
	 * ��-����� ���.
	 */
	public static void print(Short i) {
		System.out.println("��� Short");
	}

}
