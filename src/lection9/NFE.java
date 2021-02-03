package lection9;

/**
 * ����������� ���������� (� ������� ��� �� �����), ������ ��� ���, �����������
 * ��� ���������� ����: 
 * int num=Integer.parseInt("XYZ");
 * System.out.println(num);
 * 
 * @author SMD_ASY
 *
 */
public class NFE {

	public static void main(String[] args) {
		try {
			int num = Integer.parseInt("XYZ");
			System.out.println(num);
		} catch (NumberFormatException nfe) {
			System.out.println(nfe);
		}
	}
}
