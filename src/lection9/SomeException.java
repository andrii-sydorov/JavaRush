package lection9;

public class SomeException {
	/**
	 * ����������� ����������, ����������� ��� ���������� ����: int a = 42 / 0;
	 * ������� �� ����� ��� �������������� ����������.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a = 42 / 0;
		} catch (ArithmeticException ae) {
			System.out.println(ae);
			System.out.println(ae.getClass().getName());
		}
	}

}
