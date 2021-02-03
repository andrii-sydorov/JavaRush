package lection9;

public class ArrayIndexOutOfBounds {
	/**
	 * ����������� ���������� (� ������� ��� �� �����), ������ ��� ���, �����������
	 * ��� ���������� ����: 
	 * int[] m = new int[2]; 
	 * m[8] = 5;
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] m = new int[2];
		try {
			m[8] = 5;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
	}
}
